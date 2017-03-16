package com.test.model;

import java.util.Date;

/**
 * 
 * @author zhh
 *
 */
public class ActionLogVO{
	
	public int user_id;
	
	public long  player_id;
	
	public String act_type;
	
	public String content;
	
	public Date date;
	
	public ActionLogVO(){}
	
	
	
	public ActionLogVO(int user_id, long player_id, String act_type, String content) {
		super();
		this.user_id = user_id;
		this.player_id = player_id;
		this.act_type = act_type;
		this.content = content;
		this.date = new Date();
	}


}
