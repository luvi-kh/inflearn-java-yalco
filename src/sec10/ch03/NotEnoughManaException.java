package sec10.ch03;

import sec07.ch04.MagicKnight;

public class NotEnoughManaException extends RuntimeException {
    public NotEnoughManaException(MagicKnight mk, int neededMana) {
        super(
                "마나가 %d 부족합니다."
                        .formatted(neededMana - mk.mana)
        );
    }
}
