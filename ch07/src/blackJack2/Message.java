package blackJack2;

public class Message {
	public final static String BEGIN_MSG				="게임을 시작합니다. 각자 2장씩 카드를 받습니다.";
	public final static String DRAW_INTENTION_MSG		="Do you want a card? (y/n) : ";// Intention 의향 의사 의지 생각 의미 셈, ...
	public final static String DEALER_RULE_MSG			="The dealer gets one more by rule.";
	public final static String DRAW_INTENTION_DEALER_MSG="Dealer, Do you want a card? (y/n) : ";
	public final static String WRONG_INPUT_MSG			="D'oh! wrong input!!!";
	
	public final static String GAMER_CARD_CHECK_MSG		="Your Card : %s\n";
	public final static String GAMER_SCORE_CHECK_MSG	="Your Score : %2d Point\n";
	
	public final static String DEALER_CARD_CHECK_MSG	="Dealer Card : %s\n";
	public final static String DEALER_SCORE_CHECK_MSG	="Dealer's Score : %2d Point\n";
	
	public final static String GAMER_BURST_MSG			="Bursted~~!!! You lose";
	public final static String DEALER_BURST_MSG			="Bursted~~!!! Dealer lose";
	public final static String PLAYERS_FINAL_SCORE_MSG	="Dealer Score : %2d , Gamer Score : %2d\n";
	public final static String GAMER_WIN_MSG			="You win!!!";
	public final static String GAMER_LOSE_MSG			="You lose!!!";
	public final static String DRAW_GAME_MSG			="Draw game!";
}
