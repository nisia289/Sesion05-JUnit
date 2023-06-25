package ual.hmis.session05.exercise1;

public class Exercise1 {
    public int transform(int x) {
        int result = 0;
        if (x % 2 == 0)
            result = transform(x / 2);
        else if (x % 3 == 0)
            result = transform(x / 3);
        else if (x % 5 == 0)
            result = transform(x / 5);
        else return x;
        return result;
    }
}
