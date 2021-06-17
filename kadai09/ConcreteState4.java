package kadai09;

class SuiminState extends DogState {
private static SuiminState s = new SuiminState();
private SuiminState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
//なにもしない
}
public void tabeta(Dog moto) {
//なにもしない
}
public String toString() {
return "寝てる状態";
}
}
