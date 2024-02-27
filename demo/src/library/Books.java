package library;

public class Books {
	private String title;
	private String author;
	private String ISBN;
	private boolean availibilitystatus;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public boolean isAvailibilitystatus() {
		return availibilitystatus;
	}
	public void setAvailibilitystatus(boolean availibilitystatus) {
		this.availibilitystatus = availibilitystatus;
	}
	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", availibilitystatus="
				+ availibilitystatus + "]";
	}
	
	
	
	
	
	

}
