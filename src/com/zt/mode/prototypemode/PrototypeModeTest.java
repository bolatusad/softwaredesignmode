package zt.mode.prototypemode;

/**
 * ZhangTao
 * 2019/4/5 17:12
 * Description:
 */
public class PrototypeModeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeMode prototypeMode = new PrototypeMode();
        prototypeMode.setName("mike");
        OtherInfo otherInfo = new OtherInfo();
        otherInfo.setAdress("china");
        prototypeMode.setOtherInfo(otherInfo);
        PrototypeMode objTemp = (PrototypeMode) prototypeMode.clone();

        objTemp.setName("marry");
        objTemp.getOtherInfo().setAdress("guandong");

        System.out.println(prototypeMode);
        System.out.println(objTemp);

    }
}
