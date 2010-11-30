package net.daum.dna.params;

import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class Params.
 */
public class Params {
	
	/** parameter의 이름과 값을 넣어놓는 변수 */
	private Map<String, String> params;
	
	/**
	 * Instantiates a new params.
	 */
	public Params () {
		params = new HashMap<String, String>();
	}
	
	/**
	 * Sets the option.
	 *
	 * @param key 파라미터 이름 ( ex) blogName
	 * @param value 파라미터의 값 (ex) 실제의 블로그이름
	 */
	public void setOption ( String key, String value ) {
		params.put( key, value );
	}
	
	/**
	 * 파라미터의 이름에 대한 값을 반환한다.
	 *
	 * @param key 파라미터 이름
	 * @return 파라미터의 값
	 */
	public String getOption (String key) {
		return params.get( key );
	}
	
	/**
	 * 파라미터의이름과 값이 저장되어있는 map을 반환한다.
	 *
	 * @return the params map
	 */
	public Map<String, String> getOptionMap() {
		return params;
	}
}
