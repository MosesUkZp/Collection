public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    @Override
    public String toString() {
        return "\n" + "MyDayOfWeek is " + name();
    }


     public MyDayOfWeek nextDayOfWeek (){
        int ordinal = this.ordinal();
        MyDayOfWeek[] values = MyDayOfWeek.values();
        int lenght = values.length;
        return values[(ordinal+1)% lenght];
    }
}
