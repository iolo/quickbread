package net.daum.dna.api.vo.yozm;

// TODO: Auto-generated Javadoc
/**
 * 사용자 정보를 담고 있는 Class.
 * 
 * @author DAUM
 */

public class YozmUserInfo {

	/** 남자 : M , 여자 : F. */
	private String sexCode;

	/** Yozm 을 하고 있는지 여부. */
	private boolean isOpenYozm;

	/** Profile 을 열었는지 여부. */
	private boolean isOpenProfile;

	/** 사용자의 생일. */
	private String birthday;

	/** 좋아 하는 것. */
	private String likes;

	/** 싫어 하는 것. */
	private String disLikes;

	/** 잘 하는 것. */
	private String doWellThings;

	/** 좋아 하는 장소. */
	private String likePlaces;

	/** 간략한 소개 글. */
	private String introduce;

	/**
	 * 사용자의 직업 종류.
	 * 
	 * jobType : 사용자의 직업 타입 non - 비공개 stu - 학생 pri - 학생(초등학생) mid - 학생(중학생) hig
	 * - 학생(고등학생) uni - 학생(대학생) wor - 직장인 etc - 기타
	 */
	private String jobType;

	/** 직업 이름. */
	private String jobName;

	/** 홈 우측 프로필 영역에 보이는 큰 이미지. */
	private String profileBigImgURL;

	/** 글 작성시 좌측에 달리는 이미지. */
	private String profileImgURL;

	/** 다음 ID. */
	private String URLName;

	/** yozm 닉네임. */
	private String nickName;

	/** 친구 수. */
	private int followingCnt;

	/** 인기 수. */
	private int followerCnt;

	/** 나이. */
	private int age;

	/** 혈핵형 종류. */
	private String bloodtype;

	/** 블로그 주소. */
	private String blogURL;

	/** User 가 Target User 를 following 하는가. */
	private boolean isFollow;

	/** Target User가 User 를 following 하는가. */
	private boolean isFollower;

	/** 로그인 User 와 Target User 가 서로 following 하는가. */
	private boolean isBothFollow;

	/** User 가 쓴 Message 개수. */
	private int messageCnt;

	/** User 의 성별. */
	private String sex;

	/**
	 * Class 인스턴스화.
	 */
	public YozmUserInfo() {
	}

	/**
	 * Class 인스턴스화.
	 *
	 * @param sexCode the sex code
	 * @param isOpenYozm the is open yozm
	 * @param isOpenProfile the is open profile
	 * @param birthday the birthday
	 * @param likes the likes
	 * @param disLikes the dis likes
	 * @param doWellThings the do well things
	 * @param likePlaces the like places
	 * @param introduce the introduce
	 * @param jobType the job type
	 * @param jobName the job name
	 * @param profileBigImgURL the profile big img url
	 * @param profileImgURL the profile img url
	 * @param uRLName the u rl name
	 * @param nickName the nick name
	 * @param followingCnt the following cnt
	 * @param followerCnt the follower cnt
	 * @param age the age
	 * @param bloodtype the bloodtype
	 * @param blogURL the blog url
	 * @param isFollow the is follow
	 * @param isFollower the is follower
	 * @param isBothFollow the is both follow
	 * @param messageCnt the message cnt
	 * @param sex the sex
	 */
	public YozmUserInfo(String sexCode, boolean isOpenYozm, boolean isOpenProfile,
			String birthday, String likes, String disLikes,
			String doWellThings, String likePlaces, String introduce,
			String jobType, String jobName, String profileBigImgURL,
			String profileImgURL, String uRLName, String nickName,
			int followingCnt, int followerCnt, int age, String bloodtype,
			String blogURL, boolean isFollow, boolean isFollower,
			boolean isBothFollow, int messageCnt, String sex) {
		this.sexCode = sexCode;
		this.isOpenYozm = isOpenYozm;
		this.isOpenProfile = isOpenProfile;
		this.birthday = birthday;
		this.likes = likes;
		this.disLikes = disLikes;
		this.doWellThings = doWellThings;
		this.likePlaces = likePlaces;
		this.introduce = introduce;
		this.jobType = jobType;
		this.jobName = jobName;
		this.profileBigImgURL = profileBigImgURL;
		this.profileImgURL = profileImgURL;
		URLName = uRLName;
		this.nickName = nickName;
		this.followingCnt = followingCnt;
		this.followerCnt = followerCnt;
		this.age = age;
		this.bloodtype = bloodtype;
		this.blogURL = blogURL;
		this.isFollow = isFollow;
		this.isFollower = isFollower;
		this.isBothFollow = isBothFollow;
		this.messageCnt = messageCnt;
		this.sex = sex;
	}

	/**
	 * likes 변수를 가져온다.
	 * 
	 * @return the likes
	 */
	public String getLikes() {
		return likes;
	}

	/**
	 * likes 변수를 입력한다.
	 * 
	 * @param likes
	 *            the new likes
	 */
	public void setLikes(String likes) {
		this.likes = likes;
	}

	/**
	 * dis likes 변수를 가져온다.
	 * 
	 * @return the dis likes
	 */
	public String getDisLikes() {
		return disLikes;
	}

	/**
	 * dis likes 변수를 입력한다.
	 * 
	 * @param disLikes
	 *            the new dis likes
	 */
	public void setDisLikes(String disLikes) {
		this.disLikes = disLikes;
	}

	/**
	 * do well things 변수를 가져온다.
	 * 
	 * @return the do well things
	 */
	public String getDoWellThings() {
		return doWellThings;
	}

	/**
	 * do well things 변수를 입력한다.
	 * 
	 * @param doWellThings
	 *            the new do well things
	 */
	public void setDoWellThings(String doWellThings) {
		this.doWellThings = doWellThings;
	}

	/**
	 * like places 변수를 가져온다.
	 * 
	 * @return the like places
	 */
	public String getLikePlaces() {
		return likePlaces;
	}

	/**
	 * like places 변수를 입력한다.
	 * 
	 * @param likePlaces
	 *            the new like places
	 */
	public void setLikePlaces(String likePlaces) {
		this.likePlaces = likePlaces;
	}

	/**
	 * introduce 변수를 가져온다.
	 * 
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * introduce 변수를 입력한다.
	 * 
	 * @param introduce
	 *            the new introduce
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 * job type 변수를 가져온다.
	 * 
	 * @return the job type
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * job type 변수를 입력한다.
	 * 
	 * @param jobType
	 *            the new job type
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * job name 변수를 가져온다.
	 * 
	 * @return the job name
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * job name 변수를 입력한다.
	 * 
	 * @param jobName
	 *            the new job name
	 */
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	/**
	 * profile big img url 변수를 가져온다.
	 * 
	 * @return the profile big img url
	 */
	public String getProfileBigImgURL() {
		return profileBigImgURL;
	}

	/**
	 * profile big img url 변수를 입력한다.
	 * 
	 * @param profileBigImgURL
	 *            the new profile big img url
	 */
	public void setProfileBigImgURL(String profileBigImgURL) {
		this.profileBigImgURL = profileBigImgURL;
	}

	/**
	 * profile img url 변수를 가져온다.
	 * 
	 * @return the profile img url
	 */
	public String getProfileImgURL() {
		return profileImgURL;
	}

	/**
	 * profile img url 변수를 입력한다.
	 * 
	 * @param profileImgURL
	 *            the new profile img url
	 */
	public void setProfileImgURL(String profileImgURL) {
		this.profileImgURL = profileImgURL;
	}

	/**
	 * uRL name 변수를 가져온다.
	 * 
	 * @return the uRL name
	 */
	public String getURLName() {
		return URLName;
	}

	/**
	 * uRL name 변수를 입력한다.
	 * 
	 * @param uRLName
	 *            the new uRL name
	 */
	public void setURLName(String uRLName) {
		URLName = uRLName;
	}

	/**
	 * nick name 변수를 가져온다.
	 * 
	 * @return the nick name
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * nick name 변수를 입력한다.
	 * 
	 * @param nickName
	 *            the new nick name
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * following cnt 변수를 가져온다.
	 * 
	 * @return the following cnt
	 */
	public int getFollowingCnt() {
		return followingCnt;
	}

	/**
	 * following cnt 변수를 입력한다.
	 * 
	 * @param followingCnt
	 *            the new following cnt
	 */
	public void setFollowingCnt(int followingCnt) {
		this.followingCnt = followingCnt;
	}

	/**
	 * follower cnt 변수를 가져온다.
	 * 
	 * @return the follower cnt
	 */
	public int getFollowerCnt() {
		return followerCnt;
	}

	/**
	 * follower cnt 변수를 입력한다.
	 * 
	 * @param followerCnt
	 *            the new follower cnt
	 */
	public void setFollowerCnt(int followerCnt) {
		this.followerCnt = followerCnt;
	}

	/**
	 * age 변수를 가져온다.
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * age 변수를 입력한다.
	 * 
	 * @param age
	 *            the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * bloodtype 변수를 가져온다.
	 * 
	 * @return the bloodtype
	 */
	public String getBloodtype() {
		return bloodtype;
	}

	/**
	 * bloodtype 변수를 입력한다.
	 * 
	 * @param bloodtype
	 *            the new bloodtype
	 */
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	/**
	 * blog url 변수를 가져온다.
	 * 
	 * @return the blog url
	 */
	public String getBlogURL() {
		return blogURL;
	}

	/**
	 * blog url 변수를 입력한다.
	 * 
	 * @param blogURL
	 *            the new blog url
	 */
	public void setBlogURL(String blogURL) {
		this.blogURL = blogURL;
	}

	/**
	 * follow 여부를 가져온다.
	 * 
	 * @return true, if is follow
	 */
	public boolean isFollow() {
		return isFollow;
	}

	/**
	 * follow 여부를 입력한다.
	 * 
	 * @param isFollow
	 *            the new follow
	 */
	public void setFollow(boolean isFollow) {
		this.isFollow = isFollow;
	}

	/**
	 * follower 여부를 가져온다.
	 * 
	 * @return true, if is follower
	 */
	public boolean isFollower() {
		return isFollower;
	}

	/**
	 * follower 여부를 입력한다.
	 * 
	 * @param isFollower
	 *            the new follower
	 */
	public void setFollower(boolean isFollower) {
		this.isFollower = isFollower;
	}

	/**
	 * both follow 여부를 가져온다.
	 * 
	 * @return true, if is both follow
	 */
	public boolean isBothFollow() {
		return isBothFollow;
	}

	/**
	 * both follow 여부를 입력한다.
	 * 
	 * @param isBothFollow
	 *            the new both follow
	 */
	public void setBothFollow(boolean isBothFollow) {
		this.isBothFollow = isBothFollow;
	}

	/**
	 * message cnt 변수를 가져온다.
	 * 
	 * @return the message cnt
	 */
	public int getMessageCnt() {
		return messageCnt;
	}

	/**
	 * message cnt 변수를 입력한다.
	 * 
	 * @param messageCnt
	 *            the new message cnt
	 */
	public void setMessageCnt(int messageCnt) {
		this.messageCnt = messageCnt;
	}

	/**
	 * sex 변수를 가져온다.
	 * 
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * sex 변수를 입력한다.
	 * 
	 * @param sex
	 *            the new sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * sex code 변수를 가져온다.
	 * 
	 * @return the sex code
	 */
	public String getSexCode() {
		return sexCode;
	}

	/**
	 * sex code 변수를 입력한다.
	 * 
	 * @param sexCode
	 *            the new sex code
	 */
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}

	/**
	 * Yozm 사용 여부를 판단한다.
	 * 
	 * @return true, if is open yozm
	 */
	public boolean isOpenYozm() {
		return isOpenYozm;
	}

	/**
	 * Yozm 사용 여부를 입력한다.
	 * 
	 * @param isOpenYozm
	 *            the new open yozm
	 */
	public void setOpenYozm(boolean isOpenYozm) {
		this.isOpenYozm = isOpenYozm;
	}

	/**
	 * profile Open 여부를 판단한다.
	 * 
	 * @return true, if is open profile
	 */
	public boolean isOpenProfile() {
		return isOpenProfile;
	}

	/**
	 * profile Open 여부를 입력한다.
	 * 
	 * @param isOpenProfile
	 *            the new open profile
	 */
	public void setOpenProfile(boolean isOpenProfile) {
		this.isOpenProfile = isOpenProfile;
	}

	/**
	 * birthday 변수를 가져온다.
	 * 
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * birthday 변수를 입력한다.
	 * 
	 * @param birthday
	 *            the new birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}