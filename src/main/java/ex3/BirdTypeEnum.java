package ex3;
public enum BirdTypeEnum  {
	Eagle, Sparrow, Pigeon;

	public String move() {
		return this.toString()+" fly";
	}

	public String getVoice() {
		return this.toString() + " gives voice";
	}
}