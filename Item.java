public class Item
{
    String name;
    String serialNum;
    int value;

    public Item()
    {
        name = "N/A";
        serialNum = "N/A";
        value = 0;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSerialNum()
    {
        return serialNum;
    }
    public void setSerialNum(String serialNum)
    {
        this.serialNum = serialNum;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }
}
