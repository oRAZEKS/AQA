package Lesson7.Task_1;

public final class Earth {
   private static final Earth INSTANCE = new Earth();

   private Earth(){
       }
    public static Earth getInstance(){
        return INSTANCE;
    }
   }

