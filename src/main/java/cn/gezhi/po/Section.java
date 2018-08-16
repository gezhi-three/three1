package cn.gezhi.po;

public class Section {
    /**
     *
     * 该字段对应于数据库列section.section_id
     *
     */
    private Integer sectionId;

    /**
     *
     * 该字段对应于数据库列section.section_name
     *
     */
    private String sectionName;

    /**
     * 返回数据库列section.section_id的值
     *
     * @return section.section_id的值
     *
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 设置数据库列section.section_id的值
     *
     * @param sectionId section.section_id的值
     *
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 返回数据库列section.section_name的值
     *
     * @return section.section_name的值
     *
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * 设置数据库列section.section_name的值
     *
     * @param sectionName section.section_name的值
     *
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }
}