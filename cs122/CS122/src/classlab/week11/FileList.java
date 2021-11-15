package classlab.week11;

public class FileList {
	private FileList list;


	public FileList() {
		list = null;
	}


	public void add(FilePart mag) {
		FileDataNode node = new FileDataNode(FilePart);
		FileDataNode current;

		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}

	// ----------------------------------------------------------------
	// Returns this list of magazines as a string.
	// ----------------------------------------------------------------
	public String toString() {
		String result = "";

		FileDataNode current = list;

		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}

		return result;
	}


	private class FileDataNode {
		public FilePart part;
		public FileDataNode next;

		public FileDataNode(FilePart part) {
			magazine = mag;
			next = null;
		}
	}
}
