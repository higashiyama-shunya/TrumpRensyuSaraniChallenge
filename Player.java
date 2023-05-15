package trump;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Player {
	//フィールド
	List<Card> list = new ArrayList();
	//コンストラクタ

	//メソッド
	public boolean isOnePair() {
		List<Integer> numList = new ArrayList();
		for (Card c : list) {
			numList.add(c.getPower());
		}
		List<Integer> numSet = new ArrayList(new HashSet<>(numList));

		if (numList.size() - numSet.size() == 1) {
			return true;
		}

		return false;
	}

	public boolean isTwoPair() {
		List<Integer> numList = new ArrayList();
		for (Card c : list) {
			numList.add(c.getPower());
		}
		List<Integer> numSet = new ArrayList(new HashSet<>(numList));

		if (numList.size() - numSet.size() == 2) {
			return true;
		}
		return false;
	}

	public List<Card> changeCard(int cardIndex) {
		
		list.set(cardIndex, );
		
		return list;
	}
}
