package zt.mode.prototypemode;

/**
 * ZhangTao
 * 2019/4/5 16:50
 * Description:
 */
public class PrototypeMode implements Cloneable{

    private String name;

    private String number;

    private OtherInfo otherInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeMode clone = (PrototypeMode) super.clone();
        //深复制
        clone.setOtherInfo((OtherInfo) otherInfo.clone());
        return clone;
    }

    public OtherInfo getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(OtherInfo otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "PrototypeMode{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", otherInfo=" + otherInfo +
                '}';
    }
}
