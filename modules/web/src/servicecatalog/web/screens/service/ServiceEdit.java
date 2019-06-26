package servicecatalog.web.screens.service;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;
import servicecatalog.entity.Service;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@UiController("srvcat_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {

    @Inject
    private FileMultiUploadField multiUploadField;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private Notifications notifications;
    @Inject
    private DataManager dataManager;
    @Inject
    private ExportDisplay exportDisplay;
    @Inject
    private GroupBoxLayout documentBox;
    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        multiUploadField.addQueueUploadCompleteListener(queueUploadCompleteEvent -> {
            List<FileDescriptor> supportingDocuments = new LinkedList<>();
            for (Map.Entry<UUID, String> entry : multiUploadField.getUploadsMap().entrySet()) {
                UUID fileId = entry.getKey();
                String fileName = entry.getValue();
                FileDescriptor fd = fileUploadingAPI.getFileDescriptor(fileId, fileName);

                try {
                    fileUploadingAPI.putFileIntoStorage(fileId, fd);

                } catch (FileStorageException e) {
                    throw new RuntimeException("Error saving file to FileStorage", e);
                }
                supportingDocuments.add(dataManager.commit(fd));
            }

            if (supportingDocuments.size() > 0) {
                getEditedEntity().setSupportingDocuments(supportingDocuments);
                updateDocumentBox(supportingDocuments);
            }

            notifications.create()
                    .withCaption("Загруженые файлы: " + multiUploadField.getUploadsMap().values())
                    .show();
            multiUploadField.clearUploads();

        });

        multiUploadField.addFileUploadErrorListener(queueFileUploadErrorEvent -> notifications.create()
                .withCaption("File upload error")
                .show());
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        updateDocumentBox(getEditedEntity().getSupportingDocuments());
    }

    private void updateDocumentBox(List<FileDescriptor> docs){
        if (docs != null && docs.size() > 0) {
            documentBox.setVisible(true);
            for (FileDescriptor fd : docs) {
                LinkButton lb = uiComponents.create(LinkButton.class);
                lb.setCaption(fd.getName() + "  Дата создания: " + fd.getCreateDate());
                lb.addClickListener(event -> exportDisplay.show(fd, ExportFormat.OCTET_STREAM));
                documentBox.add(lb);
            }
        } else {
            documentBox.setVisible(false);
        }
    }
}