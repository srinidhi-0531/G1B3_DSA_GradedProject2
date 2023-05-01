package gp2.floorstack;

class FloorStackConstruction {
	private int[] floors;
	private int top;

	public FloorStackConstruction(int n) {
		floors = new int[n];
		top = -1;
	}

	public void update(int floorSize) {
		while (top >= 0 && floorSize < floors[top]) {
			// Pop larger floors from the stack until we find one that is smaller
			top--;
		}
		floors[++top] = floorSize;
	}

	public void print(int day) {
		if (top < 0) {
			// If there are no floors that can be assembled, leave the line empty
			System.out.println();
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.print(floors[i] + " ");
		}
		System.out.println();
	}
}