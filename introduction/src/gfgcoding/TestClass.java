package gfgcoding;

import java.io.*;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        try {
            //Write code here
            FasterScanner sc = new FasterScanner();
            String inp = sc.nextLine(); int count = 0; int set = 0;
            for(int i = 0 ; i < inp.length(); i++) {
                if(inp.charAt(i) == '(') {
                    set++;
                } else {
                    set--;
                }
            }
            int min = Integer.MAX_VALUE;
            if(set == 0) {
                for(int i = 0; i < inp.length(); i++) {
                    if(inp.charAt(i) == '(') {
                        set++;
                    } else {
                        set--;
                    }
                    if(min > set) {
                        min = set;
                        count = 0;
                    }
                    if(min == set) count++;
                }
            }
            if(set == 0) {
                System.out.println(count);
            } else {
                System.out.println(0);
            }
 
 
        } catch(Exception e) {
            return;
        }
 
    }
    public static int formula(int a, int b) {
        return (a & b) ^ (a | b);
    }
    public static class FasterScanner {
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = System.in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public String nextString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
 
        public int[] nextIntArray(int n, int offset) {
            int[] arr = new int[n + offset];
            for (int i = 0; i < n; i++) {
                arr[i + offset] = nextInt();
            }
            return arr;
        }
 
        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
 
        public long[] nextLongArray(int n, int offset) {
            long[] arr = new long[n + offset];
            for (int i = 0; i < n; i++) {
                arr[i + offset] = nextLong();
            }
            return arr;
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
    }
 
}
