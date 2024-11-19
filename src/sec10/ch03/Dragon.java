package sec10.ch03;

import sec07.ch04.Side;
import sec07.ch04.Unit;

class Dragon extends Unit {
    public Dragon(Side side) {
        super(side, 3000);
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 드래곤";
    }
}
