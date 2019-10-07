package by.bsu.web.sardyko.repository;

public enum HourRepository {
	MONDAY(9, 17), THURSDAY(9, 17), WEDNESDAY(9, 17), THUESDAY(9, 17), FRIDAY(9, 17), SATURDAY(9, 16), SUNDAY(9, 16);

	private int start;
	private int end;

	HourRepository(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
}
