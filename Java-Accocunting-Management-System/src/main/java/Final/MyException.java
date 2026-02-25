
package Final;

import java.sql.SQLException;

public class MyException extends Exception {

    public MyException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Tum alanları doldurun.";
    }
}
