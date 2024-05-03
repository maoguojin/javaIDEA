package emums;

public enum Weeks implements eat{
    //带有属性及描述信息的枚举定义
    MONDAY("星期一","上班摸鱼",1){
        @Override
        public String eat() {
            return Weeks.MONDAY.weekName;
        }
    }
    ,TUESDAY("星期二","灵魂上班", 1){
        @Override
        public String eat() {
            return Weeks.TUESDAY.weekName;
        }
    },
    WEDNESDAY("星期三","愉悦上班", 1){
        @Override
        public String eat() {
            return FRIDAY.weekName;
        }
    },
    THURSDAY("星期四","上班吃鸡", 1){
        @Override
        public String eat() {
            return FRIDAY.weekName;
        }
    },
    FRIDAY("星期五","疯狂加班", 1){
        @Override
        public String eat() {
            return FRIDAY.weekName;
        }
    },
    SATURDAY("星期六","深夜蹦迪", 1){
        @Override
        public String eat() {
            return FRIDAY.weekName;
        }
    },
    SUNDAY("周日","睡个好觉", 1){
        @Override
        public String eat() {
            return FRIDAY.weekName;
        }
    };
    private String weekName;
    private String weekDesc;
    private int i;
    private Weeks(String weekName, String weekDesc, int i){
        this.weekName = weekName;
        this.weekDesc = weekDesc;
        this.i=i;
    }
    @Override
    public String toString() {
        return weekName+":"+weekDesc+i;
    }


}
