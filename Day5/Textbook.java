public class Textbook extends Book{
	private int edition;
	public Textbook(String bookTitle, double bookPrice, int edition) {
	super(bookTitle, bookPrice);
	this.edition = edition;
}

public int getEdition() {
	return edition;
}

@Override
public String getBookInfo() {
    return super.getBookInfo() + "-" + edition;
}

public boolean canSubstituteFor(Textbook book) {
	if (this.getTitle().equals(book.getTitle()) && edition >= book.getEdition()) {
return true;
} else {
	return false;
}
}
}

