package Chap9_8_2;

public class ObjectAdapter extends ObjectMysqlOperater {
    private ObjectSecretMoudle object_secretMoudle;

    public ObjectAdapter() {
        object_secretMoudle=new ObjectSecretMoudle();
    }

    public void encrypt(){
        object_secretMoudle.getencrypt();
    }
}
