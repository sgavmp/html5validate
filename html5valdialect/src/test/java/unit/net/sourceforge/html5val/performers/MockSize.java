package unit.net.sourceforge.html5val.performers;

import java.lang.annotation.Annotation;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import net.sourceforge.html5val.performers.LengthRegexpComposer;

public class MockSize implements Size {

    private int min;
    /** By default max attribute is MAX_INT */
    private int max = LengthRegexpComposer.MAX_BOUNDARY;

    public MockSize() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int min() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int max() {
        return max;
    }

    public String message() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Class<?>[] groups() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Class<? extends Payload>[] payload() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
