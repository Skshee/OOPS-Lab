
class MyException extends Exception{
    public MyException(String message){
    super(message);
    }
}

class Q4CustomException{
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception");
        } catch (MyException e) {
                System.out.println("Exception Caught");
                System.out.println(e.getMessage());
        }
    }
}

