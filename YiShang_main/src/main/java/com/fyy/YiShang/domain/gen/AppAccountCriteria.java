package com.fyy.YiShang.domain.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppAccountCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public AppAccountCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @param mysqlOffset 
	 *            指定返回记录行的偏移量<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlOffset(Integer mysqlOffset) {
        this.mysqlOffset=mysqlOffset;
    }

    /**
     * @param mysqlLength 
	 *            指定返回记录行的最大数目<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public Integer getMysqlOffset() {
        return mysqlOffset;
    }

    /**
     * @param mysqlOffset 
	 *            指定返回记录行的偏移量<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlLength(Integer mysqlLength) {
        this.mysqlLength=mysqlLength;
    }

    /**
     * @param mysqlLength 
	 *            指定返回记录行的最大数目<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public Integer getMysqlLength() {
        return mysqlLength;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBmPhoneIsNull() {
            addCriterion("BM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andBmPhoneIsNotNull() {
            addCriterion("BM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBmPhoneEqualTo(String value) {
            addCriterion("BM_PHONE =", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneNotEqualTo(String value) {
            addCriterion("BM_PHONE <>", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneGreaterThan(String value) {
            addCriterion("BM_PHONE >", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("BM_PHONE >=", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneLessThan(String value) {
            addCriterion("BM_PHONE <", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneLessThanOrEqualTo(String value) {
            addCriterion("BM_PHONE <=", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneLike(String value) {
            addCriterion("BM_PHONE like", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneNotLike(String value) {
            addCriterion("BM_PHONE not like", value, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneIn(List<String> values) {
            addCriterion("BM_PHONE in", values, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneNotIn(List<String> values) {
            addCriterion("BM_PHONE not in", values, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneBetween(String value1, String value2) {
            addCriterion("BM_PHONE between", value1, value2, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andBmPhoneNotBetween(String value1, String value2) {
            addCriterion("BM_PHONE not between", value1, value2, "bmPhone");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("DEL_FLAG like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("DEL_FLAG not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSmsAmountIsNull() {
            addCriterion("SMS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSmsAmountIsNotNull() {
            addCriterion("SMS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSmsAmountEqualTo(Long value) {
            addCriterion("SMS_AMOUNT =", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountNotEqualTo(Long value) {
            addCriterion("SMS_AMOUNT <>", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountGreaterThan(Long value) {
            addCriterion("SMS_AMOUNT >", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("SMS_AMOUNT >=", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountLessThan(Long value) {
            addCriterion("SMS_AMOUNT <", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountLessThanOrEqualTo(Long value) {
            addCriterion("SMS_AMOUNT <=", value, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountIn(List<Long> values) {
            addCriterion("SMS_AMOUNT in", values, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountNotIn(List<Long> values) {
            addCriterion("SMS_AMOUNT not in", values, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountBetween(Long value1, Long value2) {
            addCriterion("SMS_AMOUNT between", value1, value2, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andSmsAmountNotBetween(Long value1, Long value2) {
            addCriterion("SMS_AMOUNT not between", value1, value2, "smsAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andWarningAmountIsNull() {
            addCriterion("WARNING_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWarningAmountIsNotNull() {
            addCriterion("WARNING_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWarningAmountEqualTo(Long value) {
            addCriterion("WARNING_AMOUNT =", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotEqualTo(Long value) {
            addCriterion("WARNING_AMOUNT <>", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountGreaterThan(Long value) {
            addCriterion("WARNING_AMOUNT >", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("WARNING_AMOUNT >=", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountLessThan(Long value) {
            addCriterion("WARNING_AMOUNT <", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountLessThanOrEqualTo(Long value) {
            addCriterion("WARNING_AMOUNT <=", value, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountIn(List<Long> values) {
            addCriterion("WARNING_AMOUNT in", values, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotIn(List<Long> values) {
            addCriterion("WARNING_AMOUNT not in", values, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountBetween(Long value1, Long value2) {
            addCriterion("WARNING_AMOUNT between", value1, value2, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotBetween(Long value1, Long value2) {
            addCriterion("WARNING_AMOUNT not between", value1, value2, "warningAmount");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyIsNull() {
            addCriterion("WARNING_AMOUNT_NOTIFY is null");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyIsNotNull() {
            addCriterion("WARNING_AMOUNT_NOTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyEqualTo(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY =", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyNotEqualTo(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY <>", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyGreaterThan(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY >", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyGreaterThanOrEqualTo(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY >=", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyLessThan(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY <", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyLessThanOrEqualTo(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY <=", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyLike(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY like", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyNotLike(String value) {
            addCriterion("WARNING_AMOUNT_NOTIFY not like", value, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyIn(List<String> values) {
            addCriterion("WARNING_AMOUNT_NOTIFY in", values, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyNotIn(List<String> values) {
            addCriterion("WARNING_AMOUNT_NOTIFY not in", values, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyBetween(String value1, String value2) {
            addCriterion("WARNING_AMOUNT_NOTIFY between", value1, value2, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningAmountNotifyNotBetween(String value1, String value2) {
            addCriterion("WARNING_AMOUNT_NOTIFY not between", value1, value2, "warningAmountNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountIsNull() {
            addCriterion("WARNING_SMS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountIsNotNull() {
            addCriterion("WARNING_SMS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountEqualTo(Long value) {
            addCriterion("WARNING_SMS_AMOUNT =", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountNotEqualTo(Long value) {
            addCriterion("WARNING_SMS_AMOUNT <>", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountGreaterThan(Long value) {
            addCriterion("WARNING_SMS_AMOUNT >", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("WARNING_SMS_AMOUNT >=", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountLessThan(Long value) {
            addCriterion("WARNING_SMS_AMOUNT <", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountLessThanOrEqualTo(Long value) {
            addCriterion("WARNING_SMS_AMOUNT <=", value, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountIn(List<Long> values) {
            addCriterion("WARNING_SMS_AMOUNT in", values, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountNotIn(List<Long> values) {
            addCriterion("WARNING_SMS_AMOUNT not in", values, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountBetween(Long value1, Long value2) {
            addCriterion("WARNING_SMS_AMOUNT between", value1, value2, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsAmountNotBetween(Long value1, Long value2) {
            addCriterion("WARNING_SMS_AMOUNT not between", value1, value2, "warningSmsAmount");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyIsNull() {
            addCriterion("WARNING_SMS_NOTIFY is null");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyIsNotNull() {
            addCriterion("WARNING_SMS_NOTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyEqualTo(String value) {
            addCriterion("WARNING_SMS_NOTIFY =", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyNotEqualTo(String value) {
            addCriterion("WARNING_SMS_NOTIFY <>", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyGreaterThan(String value) {
            addCriterion("WARNING_SMS_NOTIFY >", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyGreaterThanOrEqualTo(String value) {
            addCriterion("WARNING_SMS_NOTIFY >=", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyLessThan(String value) {
            addCriterion("WARNING_SMS_NOTIFY <", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyLessThanOrEqualTo(String value) {
            addCriterion("WARNING_SMS_NOTIFY <=", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyLike(String value) {
            addCriterion("WARNING_SMS_NOTIFY like", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyNotLike(String value) {
            addCriterion("WARNING_SMS_NOTIFY not like", value, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyIn(List<String> values) {
            addCriterion("WARNING_SMS_NOTIFY in", values, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyNotIn(List<String> values) {
            addCriterion("WARNING_SMS_NOTIFY not in", values, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyBetween(String value1, String value2) {
            addCriterion("WARNING_SMS_NOTIFY between", value1, value2, "warningSmsNotify");
            return (Criteria) this;
        }

        public Criteria andWarningSmsNotifyNotBetween(String value1, String value2) {
            addCriterion("WARNING_SMS_NOTIFY not between", value1, value2, "warningSmsNotify");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}