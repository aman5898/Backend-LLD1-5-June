package Factory;

public abstract class Platform {
    public void setRefreshRate(){

    }

    public void setTheme(){

    }

    public static Platform getPlatform(String Platform){
        return PlatformFactory.getPlatform(Platform);
    }

//    public Button createButton(){
////        if(this is an instance of Android ){
////            return new AndroidButton();
////        } else if(this is an instance of IOS){
////            return new IOSButton();
////        }
//    }

    public abstract UIComponentFactory createUIComponentFactory();
}