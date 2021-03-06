package syain;

import com.opensymphony.xwork2.ActionSupport;
/**
 *
 * 一覧画面の編集ボタン押下時実行
 *
 */
public class UpdateUserAction extends ActionSupport{
	private String syain_id;
	private String name;
	private String gender;
	private String birthday;

	public String Up() throws Exception{
		T_syainDAO tSyainDAO = new T_syainDAO();
		ListUser user = new ListUser();
		user = tSyainDAO.syainSelect(getSyain_id());
		this.setSyain_id(user.getSyain_id());
		this.setName(user.getName());
		this.setGender(user.getGender());
		this.setBirthday(user.getBirthday());
		return "success";
	}

	public void setSyain_id(String syain_id){
		this.syain_id = syain_id;
	}
	public String getSyain_id(){
		return syain_id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	public String getBirthday(){
		return birthday;
	}
}
