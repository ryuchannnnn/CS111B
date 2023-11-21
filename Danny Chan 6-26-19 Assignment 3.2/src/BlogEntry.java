public class BlogEntry{
  public String username;
  public String text;
  public Date entry;

public BlogEntry(){
  username = " ";
  text = " ";}

 

public BlogEntry(String username,String text,Date entry){
  this.username = username;
  this.text = text;
  this.entry = entry;
}



public void setUsername(String username){
  username = this.username;
}
public void setText(String text){
  text = this.text;
}
public String getUsername(){
  return username;
}
public String getText(){
  return text;
}
