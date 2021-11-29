package Chap13_6;

public class BackupFacade {
    private SmsManager sms;
    private SongsManager song;
    private ContactManager contact;
    private PhotoManager photo;
    public BackupFacade(){
        sms = new SmsManager();
        song = new SongsManager();
        contact = new ContactManager();
        photo = new PhotoManager();
    }
    public void oneKeyBackup(){
        sms.oneKeyBackup();
        song.oneKeyBackup();
        contact.oneKeyBackup();
        photo.oneKeyBackup();
    }
}
