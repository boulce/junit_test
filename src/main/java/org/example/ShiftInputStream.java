package org.example;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShiftInputStream extends FilterInputStream {

    private int offset;
    public ShiftInputStream(InputStream in, int offset) {
        super(in);
        this.offset = offset;
    }

    public ShiftInputStream(InputStream in) {
        this(in, 0);
    }

    public int read() throws IOException {
        int c = super.read();

        if(c == -1) {
            return c;
        }

        char tmp = (char)c;
        if(tmp >= 'a' && tmp <= 'z') {
            tmp += offset;
            if(tmp > 'z') {
                tmp -= 'z'-'a'+1;
            } else if(tmp < 'a') {
                tmp += 'z'-'a'+1;
            }
        } else if(tmp >= 'A' && tmp <= 'Z') {
            tmp += offset;
            if(tmp > 'Z') {
                tmp -= 'Z'-'A'+1;
            } else if(tmp < 'A') {
                tmp += 'Z'-'A'+1;
            }
        }

        return tmp;
    }
}
