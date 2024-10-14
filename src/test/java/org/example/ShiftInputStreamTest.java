package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ShiftInputStreamTest {
    /*
        Test only ShiftInputStream
     */

    @Test
    void onlyShiftInputStreamTest1() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc1.txt")), 1);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "Ifmmp Xpsme!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest2() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc2.txt")), -1);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "Gdkkn Vnqkc!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest3() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc3.txt")), 3);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "DEF def 123");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest4() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc4.txt")), 3);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "abc ABC!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest5() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc5.txt")), -3);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "uvw UVW!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest6() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc6.txt")), 2);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "C12BZ c#");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest7() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc7.txt")), -1);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "Z12YW z#");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest8() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc8.txt")), 5);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "XmnkyNsuzyXywjfr Yjxy!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest9() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc9.txt")), -5);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "NcdaoDikpoNomzvh Ozno!");
        System.out.println(result);
    }

    @Test
    void onlyShiftInputStreamTest10() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new ShiftInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("tc10.txt")), 7);

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "UvZopmaMvyUvuHswohilaz123!@#");
        System.out.println(result);
    }

    /*
        Test ShiftInputStream with LowerCaseInputStream
     */

    @Test
    void withLowerCaseInputStreamTest1() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("tc1.txt")), 1));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "ifmmp xpsme!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest2() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc2.txt")), -1));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "gdkkn vnqkc!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest3() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc3.txt")), 3));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "def def 123");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest4() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc4.txt")), 3));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "abc abc!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest5() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc5.txt")), -3));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "uvw uvw!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest6() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc6.txt")), 2));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "c12bz c#");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest7() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc7.txt")), -1));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "z12yw z#");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest8() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc8.txt")), 5));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "xmnkynsuzyxywjfr yjxy!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest9() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc9.txt")), -5));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "ncdaodikponomzvh ozno!");
        System.out.println(result);
    }

    @Test
    void withLowerCaseInputStreamTest10() {
        String result = "";
        try {
            int c;
            InputStream in =
                    new LowerCaseInputStream(
                            new ShiftInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("tc10.txt")), 7));

            while ((c = in.read()) >= 0) {
                result += "" + (char) c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(result, "uvzopmamvyuvuhswohilaz123!@#");
        System.out.println(result);
    }
}