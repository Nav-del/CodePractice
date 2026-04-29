class Solution {
    public int romanToInt(String s) {
        char a[] = s.toCharArray();
        int result = 0;

        for (int k = 0; k < a.length; k++) {
            int value = 0;

            switch (a[k]) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }

            if (k < a.length - 1) {
                int nextValue = 0;

                switch (a[k + 1]) {
                    case 'I': nextValue = 1; break;
                    case 'V': nextValue = 5; break;
                    case 'X': nextValue = 10; break;
                    case 'L': nextValue = 50; break;
                    case 'C': nextValue = 100; break;
                    case 'D': nextValue = 500; break;
                    case 'M': nextValue = 1000; break;
                }

                if (value < nextValue) {
                    result -= value;
                } else {
                    result += value;
                }
            } else {
                result += value;
            }
        }

        return result;
    }
}
