package Tester;

public class DataTypeTester {
    public static void testByte(){
        byte x = 15, y = -2, z;
        boolean b;
        System.out.println("\n***** Testing Byte *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (byte)(x + y);
        System.out.printf("%d + %d = %d\n", x, y, z);
        // subtraction
        z = (byte) (x - y);
        System.out.printf("%d - %d = %d\n", x, y, z);
        // multiplication
        z = (byte) (x * y);   System.out.printf("%d * %d = %d\n", x, y, z);
        // division
        z = (byte) (x / y);
        System.out.printf("%d / %d = %d\n", x, y, z);
        // division by modulus
        z = (byte) (x % y);
        System.out.printf("%d %% %d = %d\n", x, y, z);
        // unary minus
        z = (byte) (-x);
        System.out.printf("-%d = %d\n", x, z);
        // unary plus
        z = (byte) (+x);
        System.out.printf("+%d = %d\n", x, z);
        // prefix increment
        System.out.printf("++%d = %d\n", x, ++x);
        // postfix increment
        System.out.printf("%d++ = %d\n", x, x++);
        // prefix decrement
        System.out.printf("--%d = %d\n", x, --x);
        // postfix decrement
        System.out.printf("%d-- = %d\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%d == %d (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%d != %d (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%d > %d (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%d < %d (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%d >= %d (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%d <= %d (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%d >= %d) && (%d != %d) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%d >= %d) || (%d < %d) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%d != %d) ^ (%d != %d) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = (byte) (x & y);
        System.out.printf("%d & %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise OR
        z = (byte) (x | y);
        System.out.printf("%d | %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise XOR
        z = (byte) (x ^ y);
        System.out.printf("%d ^ %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise compliment
        z = (byte) (~x);
        System.out.printf("~%d = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // left shift
        z = (byte) (x << 1);
        System.out.printf("%d << 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        z = (byte) (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        x = -10;
        z = (byte) (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = 10;
        z = (byte) (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = -10;
        z = (byte) (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%d += %d (z = %d)\n", z, x, z += x);
        z = 4;
        System.out.printf("%d -= %d (z = %d)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%d *= %d (z = %d)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%d /= %d (z = %d)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%d %%= %d (z = %d)\n", z, x, z %= x);
        z = 4;
        System.out.printf("%d |= %d (z = %d)\n", z, x, z |= x);
        z = 4;
        System.out.printf("%d &= %d (z = %d)\n", z, x, z &= x);
        z = 4;
        System.out.printf("%d ^= %d (z = %d)\n", z, x, z ^= x);
        z = 4;
        System.out.printf("%d >>= 1 (z = %d)\n", z, z >>= 1);
        z = 4;
        System.out.printf("%d <<= 1 (z = %d)\n", z, z <<= 1);
        z = 4;
        System.out.printf("%d >>>= 1 (z = %d)\n", z, z >>>= 1);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%d > %d ? %d : %d) max(%d, %d) = %d\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%d < %d ? %d : %d) min(%d, %d) = %d\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        short sh = -320;
        char ch = 'n';
        int i = 140;
        long l = 32567865335L;
        float f = 1.5f;
        double d = 123;
        z = (byte) sh;
        System.out.printf("byte = short: z = (byte)%d (z = %d)\n", sh, z);
        z = (byte) ch;
        System.out.printf("byte = char: z = (byte)'%c' (z = %d)\n", ch, z);
        z = (byte) i;
        System.out.printf("byte = long: z = (byte)%d (z = %d)\n", i, z);
        z = (byte) l;
        System.out.printf("byte = long: z = (byte)%d (z = %d)\n", l, z);
        z = (byte) f;
        System.out.printf("byte = float: z = (byte)%f (z = %d)\n", f, z);
        z = (byte) d;
        System.out.printf("byte = double: z = (byte)%f (z = %d)\n", d, z);
    }
    public static void testShort(){
        short x = -14, y = 1, z;
        boolean b;
        System.out.println("\n***** Testing Short *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (short)(x + y);
        System.out.printf("%d + %d = %d\n", x, y, z);
        // subtraction
        z = (short) (x - y);
        System.out.printf("%d - %d = %d\n", x, y, z);
        // multiplication
        z = (short) (x * y);   System.out.printf("%d * %d = %d\n", x, y, z);
        // division
        z = (short) (x / y);
        System.out.printf("%d / %d = %d\n", x, y, z);
        // division by modulus
        z = (short) (x % y);
        System.out.printf("%d %% %d = %d\n", x, y, z);
        // unary minus
        z = (short) (-x);
        System.out.printf("-%d = %d\n", x, z);
        // unary plus
        z = (short) (+x);
        System.out.printf("+%d = %d\n", x, z);
        // prefix increment
        System.out.printf("++%d = %d\n", x, ++x);
        // postfix increment
        System.out.printf("%d++ = %d\n", x, x++);
        // prefix decrement
        System.out.printf("--%d = %d\n", x, --x);
        // postfix decrement
        System.out.printf("%d-- = %d\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%d == %d (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%d != %d (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%d > %d (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%d < %d (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%d >= %d (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%d <= %d (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%d >= %d) && (%d != %d) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%d >= %d) || (%d < %d) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%d != %d) ^ (%d != %d) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = (short) (x & y);
        System.out.printf("%d & %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise OR
        z = (short) (x | y);
        System.out.printf("%d | %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise XOR
        z = (short) (x ^ y);
        System.out.printf("%d ^ %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise compliment
        z = (short) (~x);
        System.out.printf("~%d = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // left shift
        z = (short) (x << 1);
        System.out.printf("%d << 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        z = (short) (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        x = -10;
        z = (short) (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = 10;
        z = (short) (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = -10;
        z = (short) (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%d += %d (z = %d)\n", z, x, z += x);
        z = 4;
        System.out.printf("%d -= %d (z = %d)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%d *= %d (z = %d)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%d /= %d (z = %d)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%d %%= %d (z = %d)\n", z, x, z %= x);
        z = 4;
        System.out.printf("%d |= %d (z = %d)\n", z, x, z |= x);
        z = 4;
        System.out.printf("%d &= %d (z = %d)\n", z, x, z &= x);
        z = 4;
        System.out.printf("%d ^= %d (z = %d)\n", z, x, z ^= x);
        z = 4;
        System.out.printf("%d >>= 1 (z = %d)\n", z, z >>= 1);
        z = 4;
        System.out.printf("%d <<= 1 (z = %d)\n", z, z <<= 1);
        z = 4;
        System.out.printf("%d >>>= 1 (z = %d)\n", z, z >>>= 1);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%d > %d ? %d : %d) max(%d, %d) = %d\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%d < %d ? %d : %d) min(%d, %d) = %d\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = -128;
        char ch = 'n';
        int i = 140;
        long l = 32567865335L;
        float f = 1.5f;
        double d = 123;
        z = bt;
        System.out.printf("short = byte: z = %d (z = %d)\n", bt, z);
        z = (short) ch;
        System.out.printf("short = char: z = (short)'%c' (z = %d)\n", ch, z);
        z = (short) i;
        System.out.printf("short = int: z = (short)%d (z = %d)\n", i, z);
        z = (short) l;
        System.out.printf("short = long: z = (short)%d (z = %d)\n", l, z);
        z = (short) f;
        System.out.printf("short = float: z = (short)%f (z = %d)\n", f, z);
        z = (short) d;
        System.out.printf("short = double: z = (short)%f (z = %d)\n", d, z);
    }
    public static void testChar(){
        char x = 'v', y = 'f', z;
        boolean b;
        System.out.println("\n***** Testing Char *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (char) (x + y);
        System.out.printf("%c + %c = %c\n", x, y, z);
        // subtraction
        z = (char) (x - y);
        System.out.printf("%c - %c = %c\n", x, y, z);
        // multiplication
        z = (char) (x * y);   System.out.printf("%c * %c = %c\n", x, y, z);
        // division
        z = (char) (x / y);
        System.out.printf("%c / %c = %c\n", x, y, z);
        // division by modulus
        z = (char) (x % y);
        System.out.printf("%c %% %c = %c\n", x, y, z);
        // unary minus
        z = (char) (-x);
        System.out.printf("-%c = %c\n", x, z);
        // unary plus
        z = (char) (+x);
        System.out.printf("+%c = %c\n", x, z);
        // prefix increment
        System.out.printf("++%c = %c\n", x, ++x);
        // postfix increment
        System.out.printf("%c++ = %c\n", x, x++);
        // prefix decrement
        System.out.printf("--%c = %c\n", x, --x);
        // postfix decrement
        System.out.printf("%c-- = %c\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%c == %c (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%c != %c (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%c > %c (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%c < %c (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%c >= %c (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%c <= %c (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%c >= %c) && (%c != %c) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%c >= %c) || (%c < %c) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%c != %c) ^ (%c != %c) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = (char) (x & y);
        System.out.printf("%c & %c = %c\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise OR
        z = (char) (x | y);
        System.out.printf("%c | %c = %c\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise XOR
        z = (char) (x ^ y);
        System.out.printf("%c ^ c = %c\n", x, y, z);
        System.out.println("in bnary form:");
        System.out.printf("%s ^ %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise compliment
        z = (char) (~x);
        System.out.printf("~%c = %c\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // left shift
        z = (char) (x << 1);
        System.out.printf("%c << 1= %c\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // right shift
        z = (char) (x >> 1);
        System.out.printf("%c >> 1 = %c\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // zero fill right shift
        z = (char) (x >>> 1);
        System.out.printf("%c >>> 1 = %c\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        System.out.println("\n***** Assignment Operators *****");
        z = '[';
        System.out.printf("%c += %c (z = %c)\n", z, x, z += x);
        z = '[';
        System.out.printf("%c -= %c (z = %c)\n", z, x, z -= x);
        z = '[';
        System.out.printf("%c *= %c (z = %c)\n", z, x, z *= x);
        z = '[';
        System.out.printf("%c /= %c (z = %c)\n", z, x, z /= x);
        z = '[';
        System.out.printf("%c %%= %c (z = %c)\n", z, x, z %= x);
        z = '[';
        System.out.printf("%c |= %c (z = %c)\n", z, x, z |= x);
        z = '[';
        System.out.printf("%c &= %c (z = %c)\n", z, x, z &= x);
        z = '[';
        System.out.printf("%c ^= %c (z = %c)\n", z, x, z ^= x);
        z = '[';
        System.out.printf("%c >>= 1 (z = %c)\n", z, z >>= 1);
        z = '[';
        System.out.printf("%c <<= 1 (z = %c)\n", z, z <<= 1);
        z = '[';
        System.out.printf("%c >>>= 1 (z = %c)\n", z, z >>>= 1);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%c > %c ? %c : %c) max(%c, %c) = %c\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%c < %c ? %c : %c) min(%c, %c) = %c\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = -128;
        short sh = 13000;
        int i = 140;
        long l = 353452345;
        float f = 1.5f;
        double d = 123;
        z = (char) bt;
        System.out.printf("char = byte: z = (char)%d (z = %c)\n", bt, z);
        z = (char) sh;
        System.out.printf("char = short: z = (char)%d (z = %c)\n", bt, z);
        z = (char) i;
        System.out.printf("char = int: z = (char)%d (z = %c)\n", i, z);
        z = (char) l;
        System.out.printf("char = long: z = (char)%d (z = %c)\n", l, z);
        z = (char) f;
        System.out.printf("char = float: z = (char)%f (z = %c)\n", f, z);
        z = (char) d;
        System.out.printf("char = double: z = (char)%f (z = %c)\n", d, z);
    }
    public static void testInt(){
        int x = 6, y = 4, z;
        boolean b;
        System.out.println("\n***** Testing Integer *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = x + y;
        System.out.printf("%d + %d = %d\n", x, y, z);
        // subtraction
        z = x - y;
        System.out.printf("%d - %d = %d\n", x, y, z);
        // multiplication
        z = x * y;   System.out.printf("%d * %d = %d\n", x, y, z);
        // division
        z = x / y;
        System.out.printf("%d / %d = %d\n", x, y, z);
        // division by modulus
        z = x % y;
        System.out.printf("%d %% %d = %d\n", x, y, z);
        // unary minus
        z = -x;
        System.out.printf("-%d = %d\n", x, z);
        // unary plus
        z = +x;
        System.out.printf("+%d = %d\n", x, z);
        // prefix increment
        System.out.printf("++%d = %d\n", x, ++x);
        // postfix increment
        System.out.printf("%d++ = %d\n", x, x++);
        // prefix decrement
        System.out.printf("--%d = %d\n", x, --x);
        // postfix decrement
        System.out.printf("%d-- = %d\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%d == %d (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%d != %d (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%d > %d (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%d < %d (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%d >= %d (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%d <= %d (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%d >= %d) && (%d != %d) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%d >= %d) || (%d < %d) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%d != %d) ^ (%d != %d) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = x & y;
        System.out.printf("%d & %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise OR
        z = x | y;
        System.out.printf("%d | %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise XOR
        z = x ^ y;
        System.out.printf("%d ^ %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(y), Integer.toBinaryString(z));
        // bitwise compliment
        z = ~x;
        System.out.printf("~%d = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // left shift
        z = x << 1;
        System.out.printf("%d << 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        z = x >> 1;
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // right shift
        x = -10;
        z = x >> 1;
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = 10;
        z = x >>> 1;
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        // zero fill right shift
        x = -10;
        z = x >>> 1;
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(x), Integer.toBinaryString(z));
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%d += %d (z = %d)\n", z, x, z += x);
        z = 4;
        System.out.printf("%d -= %d (z = %d)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%d *= %d (z = %d)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%d /= %d (z = %d)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%d %%= %d (z = %d)\n", z, x, z %= x);
        z = 4;
        System.out.printf("%d |= %d (z = %d)\n", z, x, z |= x);
        z = 4;
        System.out.printf("%d &= %d (z = %d)\n", z, x, z &= x);
        z = 4;
        System.out.printf("%d ^= %d (z = %d)\n", z, x, z ^= x);
        z = 4;
        System.out.printf("%d >>= 1 (z = %d)\n", z, z >>= 1);
        z = 4;
        System.out.printf("%d <<= 1 (z = %d)\n", z, z <<= 1);
        z = 4;
        System.out.printf("%d >>>= 1 (z = %d)\n", z, z >>>= 1);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%d > %d ? %d : %d) max(%d, %d) = %d\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%d < %d ? %d : %d) min(%d, %d) = %d\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -320;
        char ch = 'n';
        long l = 32567865335L;
        float f = 1.5f;
        double d = 123;
        z = bt;
        System.out.printf("int = byte: c = %d (z = %d)\n", bt, z);
        z = sh;
        System.out.printf("int = short: c = %d (z = %d)\n", sh, z);
        z = ch;
        System.out.printf("int = char: c = '%c' (z = %d)\n", ch, z);
        z = (int) l;
        System.out.printf("int = long: c = (int)%d (z = %d)\n", l, z);
        z = (int) f;
        System.out.printf("int = float: c = (int)%f (z = %d)\n", f, z);
        z = (int) d;
        System.out.printf("int = double: c = (int)%f (z = %d)\n", d, z);
    }
    public static void testLong(){
        long x = 29, y = -9, z;
        boolean b;
        System.out.println("\n***** Testing Long *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (x + y);
        System.out.printf("%d + %d = %d\n", x, y, z);
        // subtraction
        z = (x - y);
        System.out.printf("%d - %d = %d\n", x, y, z);
        // multiplication
        z = (x * y);   System.out.printf("%d * %d = %d\n", x, y, z);
        // division
        z = (x / y);
        System.out.printf("%d / %d = %d\n", x, y, z);
        // division by modulus
        z = (x % y);
        System.out.printf("%d %% %d = %d\n", x, y, z);
        // unary minus
        z = (-x);
        System.out.printf("-%d = %d\n", x, z);
        // unary plus
        z = (+x);
        System.out.printf("+%d = %d\n", x, z);
        // prefix increment
        System.out.printf("++%d = %d\n", x, ++x);
        // postfix increment
        System.out.printf("%d++ = %d\n", x, x++);
        // prefix decrement
        System.out.printf("--%d = %d\n", x, --x);
        // postfix decrement
        System.out.printf("%d-- = %d\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%d == %d (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%d != %d (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%d > %d (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%d < %d (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%d >= %d (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%d <= %d (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%d >= %d) && (%d != %d) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%d >= %d) || (%d < %d) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%d != %d) ^ (%d != %d) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = (x & y);
        System.out.printf("%d & %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise OR
        z = (x | y);
        System.out.printf("%d | %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise XOR
        z = (x ^ y);
        System.out.printf("%d ^ %d = %d\n", x, y, z);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(y), Long.toBinaryString(z));
        // bitwise compliment
        z = (~x);
        System.out.printf("~%d = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // left shift
        z = (x << 1);
        System.out.printf("%d << 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // right shift
        z = (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // right shift
        x = -10;
        z = (x >> 1);
        System.out.printf("%d >> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // zero fill right shift
        x = 10;
        z = (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        // zero fill right shift
        x = -10;
        z = (x >>> 1);
        System.out.printf("%d >>> 1 = %d\n", x, z);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(x), Long.toBinaryString(z));
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%d += %d (z = %d)\n", z, x, z += x);
        z = 4;
        System.out.printf("%d -= %d (z = %d)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%d *= %d (z = %d)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%d /= %d (z = %d)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%d %%= %d (z = %d)\n", z, x, z %= x);
        z = 4;
        System.out.printf("%d |= %d (z = %d)\n", z, x, z |= x);
        z = 4;
        System.out.printf("%d &= %d (z = %d)\n", z, x, z &= x);
        z = 4;
        System.out.printf("%d ^= %d (z = %d)\n", z, x, z ^= x);
        z = 4;
        System.out.printf("%d >>= 1 (z = %d)\n", z, z >>= 1);
        z = 4;
        System.out.printf("%d <<= 1 (z = %d)\n", z, z <<= 1);
        z = 4;
        System.out.printf("%d >>>= 1 (z = %d)\n", z, z >>>= 1);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%d > %d ? %d : %d) max(%d, %d) = %d\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%d < %d ? %d : %d) min(%d, %d) = %d\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = -128;
        short sh = 13000;
        char ch = 'n';
        int i = 140;
        float f = 1.5f;
        double d = 123;
        z = bt;
        System.out.printf("long = byte: z = %d (z = %d)\n", bt, z);
        z = sh;
        System.out.printf("long = short: z = %d (z = %d)\n", bt, z);
        z = ch;
        System.out.printf("long = char: z = '%c' (z = %d)\n", ch, z);
        z = i;
        System.out.printf("long = int: z = %d (z = %d)\n", i, z);
        z = (long) f;
        System.out.printf("long = float: z = (long)%f (z = %d)\n", f, z);
        z = (long) d;
        System.out.printf("long = double: z = (long)%f (z = %d)\n", d, z);
    }
    public static void testFloat(){
        float x = 1.3f, y = -0.25f, z;
        boolean b;
        System.out.println("\n***** Testing Float *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (x + y);
        System.out.printf("%f + %f = %f\n", x, y, z);
        // subtraction
        z = (x - y);
        System.out.printf("%f - %f = %f\n", x, y, z);
        // multiplication
        z = (x * y);   System.out.printf("%f * %f = %f\n", x, y, z);
        // division
        z = (x / y);
        System.out.printf("%f / %f = %f\n", x, y, z);
        // division by modulus
        z = (x % y);
        System.out.printf("%f %% %f = %f\n", x, y, z);
        // unary minus
        z = (-x);
        System.out.printf("-%f = %f\n", x, z);
        // unary plus
        z = (+x);
        System.out.printf("+%f = %f\n", x, z);
        // prefix increment
        System.out.printf("++%f = %f\n", x, ++x);
        // postfix increment
        System.out.printf("%f++ = %f\n", x, x++);
        // prefix decrement
        System.out.printf("--%f = %f\n", x, --x);
        // postfix decrement
        System.out.printf("%f-- = %f\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%f == %f (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%f != %f (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%f > %f (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%f < %f (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%f >= %f (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%f <= %f (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%f >= %f) && (%f != %f) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%f >= %f) || (%f < %f) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%f != %f) ^ (%f != %f) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%f += %f (z = %f)\n", z, x, z += x);
        z = 4;
        System.out.printf("%f -= %f (z = %f)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%f *= %f (z = %f)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%f /= %f (z = %f)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%f %%= %f (z = %f)\n", z, x, z %= x);
        z = 4;
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%f > %f ? %f : %f) max(%f, %f) = %f\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%f < %f ? %f : %f) min(%f, %f) = %f\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = -128;
        short sh = 13000;
        char ch = 'n';
        int i = 140;
        long l = 324324324243L;
        double d = 123465464365456d;
        z = bt;
        System.out.printf("float = byte: z = %d (z = %f)\n", bt, z);
        z = sh;
        System.out.printf("float = short: z = %d (z = %f)\n", bt, z);
        z = ch;
        System.out.printf("float = char: z = '%c' (z = %f)\n", ch, z);
        z = i;
        System.out.printf("float = int: z = %d (z = %f)\n", i, z);
        z = l;
        System.out.printf("float = long: z = %d (z = %f)\n", l, z);
        z = (float) d;
        System.out.printf("float = double: z = (long)%f (z = %f)\n", d, z);
    }
    public static void testDouble(){
        double x = 1.3f, y = -0.25f, z;
        boolean b;
        System.out.println("\n***** Testing Double *****");
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        z = (x + y);
        System.out.printf("%f + %f = %f\n", x, y, z);
        // subtraction
        z = (x - y);
        System.out.printf("%f - %f = %f\n", x, y, z);
        // multiplication
        z = (x * y);   System.out.printf("%f * %f = %f\n", x, y, z);
        // division
        z = (x / y);
        System.out.printf("%f / %f = %f\n", x, y, z);
        // division by modulus
        z = (x % y);
        System.out.printf("%f %% %f = %f\n", x, y, z);
        // unary minus
        z = (-x);
        System.out.printf("-%f = %f\n", x, z);
        // unary plus
        z = (+x);
        System.out.printf("+%f = %f\n", x, z);
        // prefix increment
        System.out.printf("++%f = %f\n", x, ++x);
        // postfix increment
        System.out.printf("%f++ = %f\n", x, x++);
        // prefix decrement
        System.out.printf("--%f = %f\n", x, --x);
        // postfix decrement
        System.out.printf("%f-- = %f\n", x, x--);
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.printf("%f == %f (" + b + ")\n", x, y);
        // not equal to
        b = x != y;
        System.out.printf("%f != %f (" + b + ")\n", x, y);
        // grater than
        b = x > y;
        System.out.printf("%f > %f (" + b + ")\n", x, y);
        // less than
        b = x < y;
        System.out.printf("%f < %f (" + b + ")\n", x, y);
        // greater than or equal to
        b = x >= y;
        System.out.printf("%f >= %f (" + b + ")\n", x, y);
        // less than or equal to
        b = x <= y;
        System.out.printf("%f <= %f (" + b + ")\n", x, y);
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        z = 5;
        b = (x >= y) && (z != y);
        System.out.printf("(%f >= %f) && (%f != %f) (" + b + ")\n", x, y, z, y);
        // logical OR
        b = (x >= y) || (z < y);
        System.out.printf("(%f >= %f) || (%f < %f) (" + b + ")\n", x, y, z, y);
        // logical XOR
        b = (x != y) ^ (z != y);
        System.out.printf("(%f != %f) ^ (%f != %f) (" + b + ")\n", x, y, z, y);
        System.out.println("\n***** Assignment Operators *****");
        z = 4;
        System.out.printf("%f += %f (z = %f)\n", z, x, z += x);
        z = 4;
        System.out.printf("%f -= %f (z = %f)\n", z, x, z -= x);
        z = 4;
        System.out.printf("%f *= %f (z = %f)\n", z, x, z *= x);
        z = 4;
        System.out.printf("%f /= %f (z = %f)\n", z, x, z /= x);
        z = 4;
        System.out.printf("%f %%= %f (z = %f)\n", z, x, z %= x);
        z = 4;
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("(%f > %f ? %f : %f) max(%f, %f) = %f\n", x, y, x, y, x, y, (x > y ? x : y));
        System.out.printf("(%f < %f ? %f : %f) min(%f, %f) = %f\n", x, y, x, y, x, y, (x < y ? x : y));
        System.out.println("\nType Cast Operator:");
        byte bt = -128;
        short sh = 13000;
        char ch = 'n';
        int i = 140;
        long l = 324324324243L;
        float f = -1323.5656f;
        double d = 123465464365456d;
        z = bt;
        System.out.printf("double = byte: z = %d (z = %f)\n", bt, z);
        z = sh;
        System.out.printf("double = short: z = %d (z = %f)\n", bt, z);
        z = ch;
        System.out.printf("double = char: z = '%c' (z = %f)\n", ch, z);
        z = i;
        System.out.printf("double = int: z = %d (z = %f)\n", i, z);
        z = l;
        System.out.printf("double = long: z = %d (z = %f)\n", l, z);
        z = f;
        System.out.printf("double = float: z = %f (z = %f)\n", d, z);
    }
    public static void testBoolean() {
        boolean x = true, y = false, z;
        boolean b;
        System.out.println("\n***** Testing Boolean *****");
        System.out.println("\n***** Relational Operators *****");
        // equal to
        b = x == y;
        System.out.print(x + "==" + y + "=" + b + "\n");
        // not equal to
        b = x != y;
        System.out.print(x + "!=" + y + "=" + b + "\n");
        System.out.println("\n***** Logical Operators *****");
        // logical AND
        b = (x != y) && (x == y);
        System.out.print( "(" + x + "!=" + y + ")" + "&&" + "(" + x + "==" + y + ")" + "=" + b + "\n");
        // logical OR
        b = (x != y) || (x == y);
        System.out.print( "(" + x + "!=" + y + ")" + "||" + "(" + x + "==" + y + ")" + "=" + b + "\n");
        // logical XOR
        b = (x != y) ^ (y == y);
        System.out.print( "(" + x + "!=" + y + ")" + "^" + "(" + y + "==" + y + ")" + "=" + b + "\n");
        // logical NOT
        System.out.print("!x" + "=" + !x + "(x" + "=" + x + ")" + "\n");
        System.out.println("\n***** Bitwise Operators *****");
        // bitwise AND
        z = x & y;
        System.out.println(x +" & "+ y +" = " + z + "\n");
        // bitwise OR
        z = x | y;
        System.out.println(x +" | "+ y +" = " + z + "\n");
        // bitwise XOR
        z = x ^ y;
        System.out.println(x +" ^ "+ y +" = " + z + "\n");
        System.out.println("\n***** Assignment Operators *****");
        z = x;
        z &= y;
        System.out.println(z +" &= "+ y +" = " + z + "\n");
        z |= y;
        System.out.println(z +" |= "+ y +" = " + z + "\n");
        z ^= y;
        System.out.println(z +" ^= "+ y +" = " + z + "\n");
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.print(x + "==" + y + "?" + x + ":" + y + "=" + (x == y ? x : y) + "\n");
        System.out.print(x + "!=" + y + "?" + x + ":" + y + "=" + (x != y ? x : y) + "\n");
    }
}
