package com.ghpms.dataObjects.form;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cmp_auto 2014-02-14
 * @hibernate.class table="Td14_jcgc"
 */

public class Td14_jcgc implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 499766647959854016L;

	/**
	 * 标识
	 */
	private Long id;
	
	/**
	 * @hibernate.id generator-class="sequence"
	 * @hibernate.generator-param name="sequence" value="td14_num"
	 * @return Returns the id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	 /**
 * 工程名称
 */
 private String gcmc;

 /**
 * @hibernate.property column="gcmc"
 * @return Returns the gcmc.
 */
 public String getGcmc() {
    return gcmc;
 }

 public void setGcmc(String gcmc) {
    this.gcmc = gcmc;
  }

 /**
 * 行政区域[选项]
 */
 private String xzqy;

 /**
 * @hibernate.property column="xzqy"
 * @return Returns the xzqy.
 */
 public String getXzqy() {
    return xzqy;
 }

 public void setXzqy(String xzqy) {
    this.xzqy = xzqy;
  }

 /**
 * 施工地址
 */
 private String sgdz;

 /**
 * @hibernate.property column="sgdz"
 * @return Returns the sgdz.
 */
 public String getSgdz() {
    return sgdz;
 }

 public void setSgdz(String sgdz) {
    this.sgdz = sgdz;
  }

 /**
 * 歌华监理
 */
 private String ghjl;

 /**
 * @hibernate.property column="ghjl"
 * @return Returns the ghjl.
 */
 public String getGhjl() {
    return ghjl;
 }

 public void setGhjl(String ghjl) {
    this.ghjl = ghjl;
  }

 /**
 * 歌华开工时间
 */
 private Date ghkgsj;

 /**
 * @hibernate.property column="ghkgsj"
 * @return Returns the ghkgsj.
 */
 public Date getGhkgsj() {
    return ghkgsj;
 }

 public void setGhkgsj(Date ghkgsj) {
    this.ghkgsj = ghkgsj;
  }

 /**
 * 歌华竣工时间
 */
 private Date ghjgsj;

 /**
 * @hibernate.property column="ghjgsj"
 * @return Returns the ghjgsj.
 */
 public Date getGhjgsj() {
    return ghjgsj;
 }

 public void setGhjgsj(Date ghjgsj) {
    this.ghjgsj = ghjgsj;
  }

 /**
 * 任务接收日期
 */
 private Date rwjsrq;

 /**
 * @hibernate.property column="rwjsrq"
 * @return Returns the rwjsrq.
 */
 public Date getRwjsrq() {
    return rwjsrq;
 }

 public void setRwjsrq(Date rwjsrq) {
    this.rwjsrq = rwjsrq;
  }

 /**
 * 令号申请依据[选项]
 */
 private String lhsqyj;

 /**
 * @hibernate.property column="lhsqyj"
 * @return Returns the lhsqyj.
 */
 public String getLhsqyj() {
    return lhsqyj;
 }

 public void setLhsqyj(String lhsqyj) {
    this.lhsqyj = lhsqyj;
  }

 /**
 * 任务来源[选项]
 */
 private String rwly;

 /**
 * @hibernate.property column="rwly"
 * @return Returns the rwly.
 */
 public String getRwly() {
    return rwly;
 }

 public void setRwly(String rwly) {
    this.rwly = rwly;
  }

 /**
 * 市场部负责人[人员]
 */
 private String scbfzr;

 /**
 * @hibernate.property column="scbfzr"
 * @return Returns the scbfzr.
 */
 public String getScbfzr() {
    return scbfzr;
 }

 public void setScbfzr(String scbfzr) {
    this.scbfzr = scbfzr;
  }

 /**
 * 验收报告合同部接收时间
 */
 private Date ysbghtbjssj;

 /**
 * @hibernate.property column="ysbghtbjssj"
 * @return Returns the ysbghtbjssj.
 */
 public Date getYsbghtbjssj() {
    return ysbghtbjssj;
 }

 public void setYsbghtbjssj(Date ysbghtbjssj) {
    this.ysbghtbjssj = ysbghtbjssj;
  }

 /**
 * 预计完成采购时间
 */
 private Date yjwccgsj;

 /**
 * @hibernate.property column="yjwccgsj"
 * @return Returns the yjwccgsj.
 */
 public Date getYjwccgsj() {
    return yjwccgsj;
 }

 public void setYjwccgsj(Date yjwccgsj) {
    this.yjwccgsj = yjwccgsj;
  }

 /**
 * 借用器材入库入库单制单人
 */
 private String jycqrkrkdzdr;

 /**
 * @hibernate.property column="jycqrkrkdzdr"
 * @return Returns the jycqrkrkdzdr.
 */
 public String getJycqrkrkdzdr() {
    return jycqrkrkdzdr;
 }

 public void setJycqrkrkdzdr(String jycqrkrkdzdr) {
    this.jycqrkrkdzdr = jycqrkrkdzdr;
  }

 /**
 * 借用器材入库入库单制单时间
 */
 private Date jycqrkrkdzdsj;

 /**
 * @hibernate.property column="jycqrkrkdzdsj"
 * @return Returns the jycqrkrkdzdsj.
 */
 public Date getJycqrkrkdzdsj() {
    return jycqrkrkdzdsj;
 }

 public void setJycqrkrkdzdsj(Date jycqrkrkdzdsj) {
    this.jycqrkrkdzdsj = jycqrkrkdzdsj;
  }

 /**
 * 借用器材出库出库单制单人
 */
 private String jycqckckdzdr;

 /**
 * @hibernate.property column="jycqckckdzdr"
 * @return Returns the jycqckckdzdr.
 */
 public String getJycqckckdzdr() {
    return jycqckckdzdr;
 }

 public void setJycqckckdzdr(String jycqckckdzdr) {
    this.jycqckckdzdr = jycqckckdzdr;
  }

 /**
 * 借用器材出库出库单制单时间
 */
 private Date jycqckckdzdsj;

 /**
 * @hibernate.property column="jycqckckdzdsj"
 * @return Returns the jycqckckdzdsj.
 */
 public Date getJycqckckdzdsj() {
    return jycqckckdzdsj;
 }

 public void setJycqckckdzdsj(Date jycqckckdzdsj) {
    this.jycqckckdzdsj = jycqckckdzdsj;
  }

 /**
 * 是否有借用材料
 */
 private String sfyjycl;

 /**
 * @hibernate.property column="sfyjycl"
 * @return Returns the sfyjycl.
 */
 public String getSfyjycl() {
    return sfyjycl;
 }

 public void setSfyjycl(String sfyjycl) {
    this.sfyjycl = sfyjycl;
  }

 /**
 * 借料时间
 */
 private Date jlsj;

 /**
 * @hibernate.property column="jlsj"
 * @return Returns the jlsj.
 */
 public Date getJlsj() {
    return jlsj;
 }

 public void setJlsj(Date jlsj) {
    this.jlsj = jlsj;
  }

 /**
 * 对下合同原件转发财务部时间
 */
 private Date dxhtyjzfcwbsj;

 /**
 * @hibernate.property column="dxhtyjzfcwbsj"
 * @return Returns the dxhtyjzfcwbsj.
 */
 public Date getDxhtyjzfcwbsj() {
    return dxhtyjzfcwbsj;
 }

 public void setDxhtyjzfcwbsj(Date dxhtyjzfcwbsj) {
    this.dxhtyjzfcwbsj = dxhtyjzfcwbsj;
  }

 /**
 * 计划完成时间
 */
 private Date jhwcsj;

 /**
 * @hibernate.property column="jhwcsj"
 * @return Returns the jhwcsj.
 */
 public Date getJhwcsj() {
    return jhwcsj;
 }

 public void setJhwcsj(Date jhwcsj) {
    this.jhwcsj = jhwcsj;
  }

 /**
 * 实际完成时间
 */
 private Date sjwcsj;

 /**
 * @hibernate.property column="sjwcsj"
 * @return Returns the sjwcsj.
 */
 public Date getSjwcsj() {
    return sjwcsj;
 }

 public void setSjwcsj(Date sjwcsj) {
    this.sjwcsj = sjwcsj;
  }

 /**
 * 歌华合同金额
 */
 private Double ghhtje;

 /**
 * @hibernate.property column="ghhtje"
 * @return Returns the ghhtje.
 */
 public Double getGhhtje() {
    return ghhtje;
 }

 public void setGhhtje(Double ghhtje) {
    this.ghhtje = ghhtje;
  }

 /**
 * 歌华合同签订日期
 */
 private Date ghhtqdrq;

 /**
 * @hibernate.property column="ghhtqdrq"
 * @return Returns the ghhtqdrq.
 */
 public Date getGhhtqdrq() {
    return ghhtqdrq;
 }

 public void setGhhtqdrq(Date ghhtqdrq) {
    this.ghhtqdrq = ghhtqdrq;
  }

 /**
 * 歌华合同返回日期
 */
 private Date ghhtfhrq;

 /**
 * @hibernate.property column="ghhtfhrq"
 * @return Returns the ghhtfhrq.
 */
 public Date getGhhtfhrq() {
    return ghhtfhrq;
 }

 public void setGhhtfhrq(Date ghhtfhrq) {
    this.ghhtfhrq = ghhtfhrq;
  }

 /**
 * 对下合同签订日期
 */
 private Date dxhtqdrq;

 /**
 * @hibernate.property column="dxhtqdrq"
 * @return Returns the dxhtqdrq.
 */
 public Date getDxhtqdrq() {
    return dxhtqdrq;
 }

 public void setDxhtqdrq(Date dxhtqdrq) {
    this.dxhtqdrq = dxhtqdrq;
  }

 /**
 * 对下合同金额
 */
 private Double dxhtje;

 /**
 * @hibernate.property column="dxhtje"
 * @return Returns the dxhtje.
 */
 public Double getDxhtje() {
    return dxhtje;
 }

 public void setDxhtje(Double dxhtje) {
    this.dxhtje = dxhtje;
  }

 /**
 * 备注
 */
 private String bz;

 /**
 * @hibernate.property column="bz"
 * @return Returns the bz.
 */
 public String getBz() {
    return bz;
 }

 public void setBz(String bz) {
    this.bz = bz;
  }

 /**
 * 采购器材发料时间
 */
 private Date cgqflsj;

 /**
 * @hibernate.property column="cgqflsj"
 * @return Returns the cgqflsj.
 */
 public Date getCgqflsj() {
    return cgqflsj;
 }

 public void setCgqflsj(Date cgqflsj) {
    this.cgqflsj = cgqflsj;
  }

 /**
 * 采购器材发料人
 */
 private String cgqflr;

 /**
 * @hibernate.property column="cgqflr"
 * @return Returns the cgqflr.
 */
 public String getCgqflr() {
    return cgqflr;
 }

 public void setCgqflr(String cgqflr) {
    this.cgqflr = cgqflr;
  }

 /**
 * 施工部门完工后第一次核料时间
 */
 private Date wg_hksj1;

 /**
 * @hibernate.property column="wg_hksj1"
 * @return Returns the wg_hksj1.
 */
 public Date getWg_hksj1() {
    return wg_hksj1;
 }

 public void setWg_hksj1(Date wg_hksj1) {
    this.wg_hksj1 = wg_hksj1;
  }

 /**
 * 第一次核料歌华料是否需要补退料[选项][XOR]
 */
 private String btk_btl1;

 /**
 * @hibernate.property column="btk_btl1"
 * @return Returns the btk_btl1.
 */
 public String getBtk_btl1() {
    return btk_btl1;
 }

 public void setBtk_btl1(String btk_btl1) {
    this.btk_btl1 = btk_btl1;
  }

 /**
 * 第一次核料视宽自备料是否需要补退料[选项][XOR]
 */
 private String skzblsfxbtl_hl1;

 /**
 * @hibernate.property column="skzblsfxbtl_hl1"
 * @return Returns the skzblsfxbtl_hl1.
 */
 public String getSkzblsfxbtl_hl1() {
    return skzblsfxbtl_hl1;
 }

 public void setSkzblsfxbtl_hl1(String skzblsfxbtl_hl1) {
    this.skzblsfxbtl_hl1 = skzblsfxbtl_hl1;
  }

 /**
 * 第一次核料核料单位
 */
 private String hkdw_hl1;

 /**
 * @hibernate.property column="hkdw_hl1"
 * @return Returns the hkdw_hl1.
 */
 public String getHkdw_hl1() {
    return hkdw_hl1;
 }

 public void setHkdw_hl1(String hkdw_hl1) {
    this.hkdw_hl1 = hkdw_hl1;
  }

 /**
 * 第一次核料核料人
 */
 private String hkr_hl1;

 /**
 * @hibernate.property column="hkr_hl1"
 * @return Returns the hkr_hl1.
 */
 public String getHkr_hl1() {
    return hkr_hl1;
 }

 public void setHkr_hl1(String hkr_hl1) {
    this.hkr_hl1 = hkr_hl1;
  }

 /**
 * 第一次核料补退料人
 */
 private String btlr_hl1;

 /**
 * @hibernate.property column="btlr_hl1"
 * @return Returns the btlr_hl1.
 */
 public String getBtlr_hl1() {
    return btlr_hl1;
 }

 public void setBtlr_hl1(String btlr_hl1) {
    this.btlr_hl1 = btlr_hl1;
  }

 /**
 * 第一次核料补退料时间
 */
 private Date btlsj_hl1;

 /**
 * @hibernate.property column="btlsj_hl1"
 * @return Returns the btlsj_hl1.
 */
 public Date getBtlsj_hl1() {
    return btlsj_hl1;
 }

 public void setBtlsj_hl1(Date btlsj_hl1) {
    this.btlsj_hl1 = btlsj_hl1;
  }

 /**
 * 收到合同结算部移交验收报告、器材结算单
 */
 private Date ysbgqcjsd;

 /**
 * @hibernate.property column="ysbgqcjsd"
 * @return Returns the ysbgqcjsd.
 */
 public Date getYsbgqcjsd() {
    return ysbgqcjsd;
 }

 public void setYsbgqcjsd(Date ysbgqcjsd) {
    this.ysbgqcjsd = ysbgqcjsd;
  }

 /**
 * 二次歌华调拨料核料
 */
 private Date ghtbl_hl2;

 /**
 * @hibernate.property column="ghtbl_hl2"
 * @return Returns the ghtbl_hl2.
 */
 public Date getGhtbl_hl2() {
    return ghtbl_hl2;
 }

 public void setGhtbl_hl2(Date ghtbl_hl2) {
    this.ghtbl_hl2 = ghtbl_hl2;
  }

 /**
 * 是否二次需要补退料[选项][XOR]
 */
 private String sfxybtl2;

 /**
 * @hibernate.property column="sfxybtl2"
 * @return Returns the sfxybtl2.
 */
 public String getSfxybtl2() {
    return sfxybtl2;
 }

 public void setSfxybtl2(String sfxybtl2) {
    this.sfxybtl2 = sfxybtl2;
  }

 /**
 * 二次补退料时间
 */
 private Date sj_btl2;

 /**
 * @hibernate.property column="sj_btl2"
 * @return Returns the sj_btl2.
 */
 public Date getSj_btl2() {
    return sj_btl2;
 }

 public void setSj_btl2(Date sj_btl2) {
    this.sj_btl2 = sj_btl2;
  }

 /**
 * 二次补退料领料部门
 */
 private String llbm_btl2;

 /**
 * @hibernate.property column="llbm_btl2"
 * @return Returns the llbm_btl2.
 */
 public String getLlbm_btl2() {
    return llbm_btl2;
 }

 public void setLlbm_btl2(String llbm_btl2) {
    this.llbm_btl2 = llbm_btl2;
  }

 /**
 * 二次补退料领料人
 */
 private String llr_btl2;

 /**
 * @hibernate.property column="llr_btl2"
 * @return Returns the llr_btl2.
 */
 public String getLlr_btl2() {
    return llr_btl2;
 }

 public void setLlr_btl2(String llr_btl2) {
    this.llr_btl2 = llr_btl2;
  }

 /**
 * 二次补退料发料人
 */
 private String flr_btl2;

 /**
 * @hibernate.property column="flr_btl2"
 * @return Returns the flr_btl2.
 */
 public String getFlr_btl2() {
    return flr_btl2;
 }

 public void setFlr_btl2(String flr_btl2) {
    this.flr_btl2 = flr_btl2;
  }

 /**
 * 出具此工程最终器材施工使用量出单人
 */
 private String cjcgczzqcsgsylcdr;

 /**
 * @hibernate.property column="cjcgczzqcsgsylcdr"
 * @return Returns the cjcgczzqcsgsylcdr.
 */
 public String getCjcgczzqcsgsylcdr() {
    return cjcgczzqcsgsylcdr;
 }

 public void setCjcgczzqcsgsylcdr(String cjcgczzqcsgsylcdr) {
    this.cjcgczzqcsgsylcdr = cjcgczzqcsgsylcdr;
  }

 /**
 * 出具此工程最终器材施工使用量时间
 */
 private Date cjcgczzqcsgsylsj;

 /**
 * @hibernate.property column="cjcgczzqcsgsylsj"
 * @return Returns the cjcgczzqcsgsylsj.
 */
 public Date getCjcgczzqcsgsylsj() {
    return cjcgczzqcsgsylsj;
 }

 public void setCjcgczzqcsgsylsj(Date cjcgczzqcsgsylsj) {
    this.cjcgczzqcsgsylsj = cjcgczzqcsgsylsj;
  }

 /**
 * 歌华器材结算核对完成时间
 */
 private Date ghqcjshdwcsj;

 /**
 * @hibernate.property column="ghqcjshdwcsj"
 * @return Returns the ghqcjshdwcsj.
 */
 public Date getGhqcjshdwcsj() {
    return ghqcjshdwcsj;
 }

 public void setGhqcjshdwcsj(Date ghqcjshdwcsj) {
    this.ghqcjshdwcsj = ghqcjshdwcsj;
  }

 /**
 * 与歌华核对人
 */
 private String yghhdr;

 /**
 * @hibernate.property column="yghhdr"
 * @return Returns the yghhdr.
 */
 public String getYghhdr() {
    return yghhdr;
 }

 public void setYghhdr(String yghhdr) {
    this.yghhdr = yghhdr;
  }

 /**
 * 收到合同结算部结算单
 */
 private Date sdhtjsbjsd;

 /**
 * @hibernate.property column="sdhtjsbjsd"
 * @return Returns the sdhtjsbjsd.
 */
 public Date getSdhtjsbjsd() {
    return sdhtjsbjsd;
 }

 public void setSdhtjsbjsd(Date sdhtjsbjsd) {
    this.sdhtjsbjsd = sdhtjsbjsd;
  }

 /**
 * 完成审核合同结算部结算单
 */
 private Date wcshhtjsbjsd;

 /**
 * @hibernate.property column="wcshhtjsbjsd"
 * @return Returns the wcshhtjsbjsd.
 */
 public Date getWcshhtjsbjsd() {
    return wcshhtjsbjsd;
 }

 public void setWcshhtjsbjsd(Date wcshhtjsbjsd) {
    this.wcshhtjsbjsd = wcshhtjsbjsd;
  }

 /**
 * 结算单审核人
 */
 private String jsdshr;

 /**
 * @hibernate.property column="jsdshr"
 * @return Returns the jsdshr.
 */
 public String getJsdshr() {
    return jsdshr;
 }

 public void setJsdshr(String jsdshr) {
    this.jsdshr = jsdshr;
  }

 /**
 * 收到施工部门转交自备料结算表
 */
 private Date zbljsb_sdsgbmzj;

 /**
 * @hibernate.property column="zbljsb_sdsgbmzj"
 * @return Returns the zbljsb_sdsgbmzj.
 */
 public Date getZbljsb_sdsgbmzj() {
    return zbljsb_sdsgbmzj;
 }

 public void setZbljsb_sdsgbmzj(Date zbljsb_sdsgbmzj) {
    this.zbljsb_sdsgbmzj = zbljsb_sdsgbmzj;
  }

 /**
 * 完成审核自备料结算表
 */
 private Date zbljsb_wcsh;

 /**
 * @hibernate.property column="zbljsb_wcsh"
 * @return Returns the zbljsb_wcsh.
 */
 public Date getZbljsb_wcsh() {
    return zbljsb_wcsh;
 }

 public void setZbljsb_wcsh(Date zbljsb_wcsh) {
    this.zbljsb_wcsh = zbljsb_wcsh;
  }

 /**
 * 审核自备料结算表审核人
 */
 private String zbljsb_shshr;

 /**
 * @hibernate.property column="zbljsb_shshr"
 * @return Returns the zbljsb_shshr.
 */
 public String getZbljsb_shshr() {
    return zbljsb_shshr;
 }

 public void setZbljsb_shshr(String zbljsb_shshr) {
    this.zbljsb_shshr = zbljsb_shshr;
  }

 /**
 * 收到合同结算部撤令结算单时间
 */
 private Date sdhtjsb_cljsdsj;

 /**
 * @hibernate.property column="sdhtjsb_cljsdsj"
 * @return Returns the sdhtjsb_cljsdsj.
 */
 public Date getSdhtjsb_cljsdsj() {
    return sdhtjsb_cljsdsj;
 }

 public void setSdhtjsb_cljsdsj(Date sdhtjsb_cljsdsj) {
    this.sdhtjsb_cljsdsj = sdhtjsb_cljsdsj;
  }

 /**
 * 完成合同结算部撤令结算单时间
 */
 private Date wchtb_cljsdsj;

 /**
 * @hibernate.property column="wchtb_cljsdsj"
 * @return Returns the wchtb_cljsdsj.
 */
 public Date getWchtb_cljsdsj() {
    return wchtb_cljsdsj;
 }

 public void setWchtb_cljsdsj(Date wchtb_cljsdsj) {
    this.wchtb_cljsdsj = wchtb_cljsdsj;
  }

 /**
 * 撤令结算表审核人
 */
 private String cljsbshr;

 /**
 * @hibernate.property column="cljsbshr"
 * @return Returns the cljsbshr.
 */
 public String getCljsbshr() {
    return cljsbshr;
 }

 public void setCljsbshr(String cljsbshr) {
    this.cljsbshr = cljsbshr;
  }

 /**
 * 机房编号
 */
 private String jfbh;

 /**
 * @hibernate.property column="jfbh"
 * @return Returns the jfbh.
 */
 public String getJfbh() {
    return jfbh;
 }

 public void setJfbh(String jfbh) {
    this.jfbh = jfbh;
  }

 /**
 * 协议总点数
 */
 private String xyzds;

 /**
 * @hibernate.property column="xyzds"
 * @return Returns the xyzds.
 */
 public String getXyzds() {
    return xyzds;
 }

 public void setXyzds(String xyzds) {
    this.xyzds = xyzds;
  }

 /**
 * 协议上行点数
 */
 private String xysxds;

 /**
 * @hibernate.property column="xysxds"
 * @return Returns the xysxds.
 */
 public String getXysxds() {
    return xysxds;
 }

 public void setXysxds(String xysxds) {
    this.xysxds = xysxds;
  }

 /**
 * 协议下行点数
 */
 private String xyxxds;

 /**
 * @hibernate.property column="xyxxds"
 * @return Returns the xyxxds.
 */
 public String getXyxxds() {
    return xyxxds;
 }

 public void setXyxxds(String xyxxds) {
    this.xyxxds = xyxxds;
  }

 /**
 * 协议数据点数
 */
 private String xysjds;

 /**
 * @hibernate.property column="xysjds"
 * @return Returns the xysjds.
 */
 public String getXysjds() {
    return xysjds;
 }

 public void setXysjds(String xysjds) {
    this.xysjds = xysjds;
  }

 /**
 * 协议反向监控点数
 */
 private String xyfsjkds;

 /**
 * @hibernate.property column="xyfsjkds"
 * @return Returns the xyfsjkds.
 */
 public String getXyfsjkds() {
    return xyfsjkds;
 }

 public void setXyfsjkds(String xyfsjkds) {
    this.xyfsjkds = xyfsjkds;
  }

 /**
 * 协议窄带插入点数
 */
 private String xyzdcrds;

 /**
 * @hibernate.property column="xyzdcrds"
 * @return Returns the xyzdcrds.
 */
 public String getXyzdcrds() {
    return xyzdcrds;
 }

 public void setXyzdcrds(String xyzdcrds) {
    this.xyzdcrds = xyzdcrds;
  }

 /**
 * 视宽项目负责人
 */
 private String skxmfzr;

 /**
 * @hibernate.property column="skxmfzr"
 * @return Returns the skxmfzr.
 */
 public String getSkxmfzr() {
    return skxmfzr;
 }

 public void setSkxmfzr(String skxmfzr) {
    this.skxmfzr = skxmfzr;
  }

 /**
 * 视宽开工日期
 */
 private Date skkg;

 /**
 * @hibernate.property column="skkg"
 * @return Returns the skkg.
 */
 public Date getSkkg() {
    return skkg;
 }

 public void setSkkg(Date skkg) {
    this.skkg = skkg;
  }

 /**
 * 施工单位
 */
 private String sgdw;

 /**
 * @hibernate.property column="sgdw"
 * @return Returns the sgdw.
 */
 public String getSgdw() {
    return sgdw;
 }

 public void setSgdw(String sgdw) {
    this.sgdw = sgdw;
  }

 /**
 * 工作内容
 */
 private String gznr;

 /**
 * @hibernate.property column="gznr"
 * @return Returns the gznr.
 */
 public String getGznr() {
    return gznr;
 }

 public void setGznr(String gznr) {
    this.gznr = gznr;
  }

 /**
 * 工程状态
 */
 private String gczt;

 /**
 * @hibernate.property column="gczt"
 * @return Returns the gczt.
 */
 public String getGczt() {
    return gczt;
 }

 public void setGczt(String gczt) {
    this.gczt = gczt;
  }

 /**
 * 工程状态备注
 */
 private String gcztbz;

 /**
 * @hibernate.property column="gcztbz"
 * @return Returns the gcztbz.
 */
 public String getGcztbz() {
    return gcztbz;
 }

 public void setGcztbz(String gcztbz) {
    this.gcztbz = gcztbz;
  }

 /**
 * 歌华要求竣工日期
 */
 private Date ghyqjgrq;

 /**
 * @hibernate.property column="ghyqjgrq"
 * @return Returns the ghyqjgrq.
 */
 public Date getGhyqjgrq() {
    return ghyqjgrq;
 }

 public void setGhyqjgrq(Date ghyqjgrq) {
    this.ghyqjgrq = ghyqjgrq;
  }

 /**
 * 视宽竣工日期
 */
 private Date skjgrq;

 /**
 * @hibernate.property column="skjgrq"
 * @return Returns the skjgrq.
 */
 public Date getSkjgrq() {
    return skjgrq;
 }

 public void setSkjgrq(Date skjgrq) {
    this.skjgrq = skjgrq;
  }

 /**
 * 竣工总点数
 */
 private String jgzds;

 /**
 * @hibernate.property column="jgzds"
 * @return Returns the jgzds.
 */
 public String getJgzds() {
    return jgzds;
 }

 public void setJgzds(String jgzds) {
    this.jgzds = jgzds;
  }

 /**
 * 竣工上行点数
 */
 private String jgsxds;

 /**
 * @hibernate.property column="jgsxds"
 * @return Returns the jgsxds.
 */
 public String getJgsxds() {
    return jgsxds;
 }

 public void setJgsxds(String jgsxds) {
    this.jgsxds = jgsxds;
  }

 /**
 * 竣工下行点数
 */
 private String jgxxds;

 /**
 * @hibernate.property column="jgxxds"
 * @return Returns the jgxxds.
 */
 public String getJgxxds() {
    return jgxxds;
 }

 public void setJgxxds(String jgxxds) {
    this.jgxxds = jgxxds;
  }

 /**
 * 竣工数据点数
 */
 private String jgsjds;

 /**
 * @hibernate.property column="jgsjds"
 * @return Returns the jgsjds.
 */
 public String getJgsjds() {
    return jgsjds;
 }

 public void setJgsjds(String jgsjds) {
    this.jgsjds = jgsjds;
  }

 /**
 * 竣工反向监控点数
 */
 private String jgfsjkds;

 /**
 * @hibernate.property column="jgfsjkds"
 * @return Returns the jgfsjkds.
 */
 public String getJgfsjkds() {
    return jgfsjkds;
 }

 public void setJgfsjkds(String jgfsjkds) {
    this.jgfsjkds = jgfsjkds;
  }

 /**
 * 竣工窄带插入点数
 */
 private String jgzdcrds;

 /**
 * @hibernate.property column="jgzdcrds"
 * @return Returns the jgzdcrds.
 */
 public String getJgzdcrds() {
    return jgzdcrds;
 }

 public void setJgzdcrds(String jgzdcrds) {
    this.jgzdcrds = jgzdcrds;
  }

 /**
 * 竣工资料上报日期
 */
 private Date jgzlsbrq;

 /**
 * @hibernate.property column="jgzlsbrq"
 * @return Returns the jgzlsbrq.
 */
 public Date getJgzlsbrq() {
    return jgzlsbrq;
 }

 public void setJgzlsbrq(Date jgzlsbrq) {
    this.jgzlsbrq = jgzlsbrq;
  }

 /**
 * 歌华器材核算完成日期
 */
 private Date ghqc_hswcrq;

 /**
 * @hibernate.property column="ghqc_hswcrq"
 * @return Returns the ghqc_hswcrq.
 */
 public Date getGhqc_hswcrq() {
    return ghqc_hswcrq;
 }

 public void setGhqc_hswcrq(Date ghqc_hswcrq) {
    this.ghqc_hswcrq = ghqc_hswcrq;
  }

 /**
 * 验收日期
 */
 private Date ysrq;

 /**
 * @hibernate.property column="ysrq"
 * @return Returns the ysrq.
 */
 public Date getYsrq() {
    return ysrq;
 }

 public void setYsrq(Date ysrq) {
    this.ysrq = ysrq;
  }

 /**
 * 结算日期
 */
 private Date jsrq;

 /**
 * @hibernate.property column="jsrq"
 * @return Returns the jsrq.
 */
 public Date getJsrq() {
    return jsrq;
 }

 public void setJsrq(Date jsrq) {
    this.jsrq = jsrq;
  }

 /**
 * 歌华施工协议盖章日期
 */
 private Date ghsgxygzrq;

 /**
 * @hibernate.property column="ghsgxygzrq"
 * @return Returns the ghsgxygzrq.
 */
 public Date getGhsgxygzrq() {
    return ghsgxygzrq;
 }

 public void setGhsgxygzrq(Date ghsgxygzrq) {
    this.ghsgxygzrq = ghsgxygzrq;
  }

 /**
 * 歌华施工协议盖章返回日期
 */
 private Date ghsgxygzfhrq;

 /**
 * @hibernate.property column="ghsgxygzfhrq"
 * @return Returns the ghsgxygzfhrq.
 */
 public Date getGhsgxygzfhrq() {
    return ghsgxygzfhrq;
 }

 public void setGhsgxygzfhrq(Date ghsgxygzfhrq) {
    this.ghsgxygzfhrq = ghsgxygzfhrq;
  }

 /**
 * 验收报告返回合同部日期
 */
 private Date ysbgfhhtbrq;

 /**
 * @hibernate.property column="ysbgfhhtbrq"
 * @return Returns the ysbgfhhtbrq.
 */
 public Date getYsbgfhhtbrq() {
    return ysbgfhhtbrq;
 }

 public void setYsbgfhhtbrq(Date ysbgfhhtbrq) {
    this.ysbgfhhtbrq = ysbgfhhtbrq;
  }

 /**
 * 调试协议盖章日期
 */
 private Date tsxygzrq;

 /**
 * @hibernate.property column="tsxygzrq"
 * @return Returns the tsxygzrq.
 */
 public Date getTsxygzrq() {
    return tsxygzrq;
 }

 public void setTsxygzrq(Date tsxygzrq) {
    this.tsxygzrq = tsxygzrq;
  }

 /**
 * 调试协议盖章返回日期
 */
 private Date tsxygzfhrq;

 /**
 * @hibernate.property column="tsxygzfhrq"
 * @return Returns the tsxygzfhrq.
 */
 public Date getTsxygzfhrq() {
    return tsxygzfhrq;
 }

 public void setTsxygzfhrq(Date tsxygzfhrq) {
    this.tsxygzfhrq = tsxygzfhrq;
  }

 /**
 * 歌华施工协议金额
 */
 private Double ghsgxyje;

 /**
 * @hibernate.property column="ghsgxyje"
 * @return Returns the ghsgxyje.
 */
 public Double getGhsgxyje() {
    return ghsgxyje;
 }

 public void setGhsgxyje(Double ghsgxyje) {
    this.ghsgxyje = ghsgxyje;
  }

 /**
 * 歌华调试协议金额
 */
 private Double ghtsxyje;

 /**
 * @hibernate.property column="ghtsxyje"
 * @return Returns the ghtsxyje.
 */
 public Double getGhtsxyje() {
    return ghtsxyje;
 }

 public void setGhtsxyje(Double ghtsxyje) {
    this.ghtsxyje = ghtsxyje;
  }

 /**
 * 结算状态说明
 */
 private String jsztsm;

 /**
 * @hibernate.property column="jsztsm"
 * @return Returns the jsztsm.
 */
 public String getJsztsm() {
    return jsztsm;
 }

 public void setJsztsm(String jsztsm) {
    this.jsztsm = jsztsm;
  }

 /**
 * 施工、调试对上结算金额
 */
 private Double sgtsdsjsje;

 /**
 * @hibernate.property column="sgtsdsjsje"
 * @return Returns the sgtsdsjsje.
 */
 public Double getSgtsdsjsje() {
    return sgtsdsjsje;
 }

 public void setSgtsdsjsje(Double sgtsdsjsje) {
    this.sgtsdsjsje = sgtsdsjsje;
  }

 /**
 * 设计对上结算金额
 */
 private Double sjdsjsje;

 /**
 * @hibernate.property column="sjdsjsje"
 * @return Returns the sjdsjsje.
 */
 public Double getSjdsjsje() {
    return sjdsjsje;
 }

 public void setSjdsjsje(Double sjdsjsje) {
    this.sjdsjsje = sjdsjsje;
  }

 /**
 * 对上结算批次
 */
 private String dsjspc;

 /**
 * @hibernate.property column="dsjspc"
 * @return Returns the dsjspc.
 */
 public String getDsjspc() {
    return dsjspc;
 }

 public void setDsjspc(String dsjspc) {
    this.dsjspc = dsjspc;
  }

 /**
 * 开发票日期
 */
 private Date kfprq;

 /**
 * @hibernate.property column="kfprq"
 * @return Returns the kfprq.
 */
 public Date getKfprq() {
    return kfprq;
 }

 public void setKfprq(Date kfprq) {
    this.kfprq = kfprq;
  }

 /**
 * 工程年份[选项]
 */
 private Long gcnf;

 /**
 * @hibernate.property column="gcnf"
 * @return Returns the gcnf.
 */
 public Long getGcnf() {
    return gcnf;
 }

 public void setGcnf(Long gcnf) {
    this.gcnf = gcnf;
  }

 /**
 * 上报器材结算日期
 */
 private Date sbqcjsrq;

 /**
 * @hibernate.property column="sbqcjsrq"
 * @return Returns the sbqcjsrq.
 */
 public Date getSbqcjsrq() {
    return sbqcjsrq;
 }

 public void setSbqcjsrq(Date sbqcjsrq) {
    this.sbqcjsrq = sbqcjsrq;
  }

 /**
 * 器材结算日期
 */
 private Date qcjsrq;

 /**
 * @hibernate.property column="qcjsrq"
 * @return Returns the qcjsrq.
 */
 public Date getQcjsrq() {
    return qcjsrq;
 }

 public void setQcjsrq(Date qcjsrq) {
    this.qcjsrq = qcjsrq;
  }

 /**
 * 计财结算申请日期
 */
 private Date jcjssqrq;

 /**
 * @hibernate.property column="jcjssqrq"
 * @return Returns the jcjssqrq.
 */
 public Date getJcjssqrq() {
    return jcjssqrq;
 }

 public void setJcjssqrq(Date jcjssqrq) {
    this.jcjssqrq = jcjssqrq;
  }

 /**
 * 计财结算日期
 */
 private Date jcjsrq;

 /**
 * @hibernate.property column="jcjsrq"
 * @return Returns the jcjsrq.
 */
 public Date getJcjsrq() {
    return jcjsrq;
 }

 public void setJcjsrq(Date jcjsrq) {
    this.jcjsrq = jcjsrq;
  }

 /**
 * 预付金额
 */
 private Double yfje;

 /**
 * @hibernate.property column="yfje"
 * @return Returns the yfje.
 */
 public Double getYfje() {
    return yfje;
 }

 public void setYfje(Double yfje) {
    this.yfje = yfje;
  }

 /**
 * 预付日期
 */
 private Date yfrq;

 /**
 * @hibernate.property column="yfrq"
 * @return Returns the yfrq.
 */
 public Date getYfrq() {
    return yfrq;
 }

 public void setYfrq(Date yfrq) {
    this.yfrq = yfrq;
  }

 /**
 * 回款日期
 */
 private Date hkrq;

 /**
 * @hibernate.property column="hkrq"
 * @return Returns the hkrq.
 */
 public Date getHkrq() {
    return hkrq;
 }

 public void setHkrq(Date hkrq) {
    this.hkrq = hkrq;
  }

 /**
 * 对下结算标准
 */
 private String dxjsbz;

 /**
 * @hibernate.property column="dxjsbz"
 * @return Returns the dxjsbz.
 */
 public String getDxjsbz() {
    return dxjsbz;
 }

 public void setDxjsbz(String dxjsbz) {
    this.dxjsbz = dxjsbz;
  }

 /**
 * 结算单签字日期
 */
 private Date jsdqzrq;

 /**
 * @hibernate.property column="jsdqzrq"
 * @return Returns the jsdqzrq.
 */
 public Date getJsdqzrq() {
    return jsdqzrq;
 }

 public void setJsdqzrq(Date jsdqzrq) {
    this.jsdqzrq = jsdqzrq;
  }

 /**
 * 财务审核日期
 */
 private Date cwshrq;

 /**
 * @hibernate.property column="cwshrq"
 * @return Returns the cwshrq.
 */
 public Date getCwshrq() {
    return cwshrq;
 }

 public void setCwshrq(Date cwshrq) {
    this.cwshrq = cwshrq;
  }

 /**
 * 对下结算批次
 */
 private String dxjspc;

 /**
 * @hibernate.property column="dxjspc"
 * @return Returns the dxjspc.
 */
 public String getDxjspc() {
    return dxjspc;
 }

 public void setDxjspc(String dxjspc) {
    this.dxjspc = dxjspc;
  }

 /**
 * 对下付款批准日期
 */
 private Date dxfkpzrq;

 /**
 * @hibernate.property column="dxfkpzrq"
 * @return Returns the dxfkpzrq.
 */
 public Date getDxfkpzrq() {
    return dxfkpzrq;
 }

 public void setDxfkpzrq(Date dxfkpzrq) {
    this.dxfkpzrq = dxfkpzrq;
  }

 /**
 * 领款日期
 */
 private Date lkrq;

 /**
 * @hibernate.property column="lkrq"
 * @return Returns the lkrq.
 */
 public Date getLkrq() {
    return lkrq;
 }

 public void setLkrq(Date lkrq) {
    this.lkrq = lkrq;
  }

 /**
 * 对下预付款金额
 */
 private Double dxyfkje;

 /**
 * @hibernate.property column="dxyfkje"
 * @return Returns the dxyfkje.
 */
 public Double getDxyfkje() {
    return dxyfkje;
 }

 public void setDxyfkje(Double dxyfkje) {
    this.dxyfkje = dxyfkje;
  }

 /**
 * 对下预付款批次
 */
 private String dxyfkpc;

 /**
 * @hibernate.property column="dxyfkpc"
 * @return Returns the dxyfkpc.
 */
 public String getDxyfkpc() {
    return dxyfkpc;
 }

 public void setDxyfkpc(String dxyfkpc) {
    this.dxyfkpc = dxyfkpc;
  }

 /**
 * 预付款领款日期
 */
 private Date yfklkrq;

 /**
 * @hibernate.property column="yfklkrq"
 * @return Returns the yfklkrq.
 */
 public Date getYfklkrq() {
    return yfklkrq;
 }

 public void setYfklkrq(Date yfklkrq) {
    this.yfklkrq = yfklkrq;
  }

 /**
 * 公司内部结算价
 */
 private Double gsnbjsj;

 /**
 * @hibernate.property column="gsnbjsj"
 * @return Returns the gsnbjsj.
 */
 public Double getGsnbjsj() {
    return gsnbjsj;
 }

 public void setGsnbjsj(Double gsnbjsj) {
    this.gsnbjsj = gsnbjsj;
  }

 /**
 * 对上合同办公室盖章时间
 */
 private Date dshtbgsgzsj;

 /**
 * @hibernate.property column="dshtbgsgzsj"
 * @return Returns the dshtbgsgzsj.
 */
 public Date getDshtbgsgzsj() {
    return dshtbgsgzsj;
 }

 public void setDshtbgsgzsj(Date dshtbgsgzsj) {
    this.dshtbgsgzsj = dshtbgsgzsj;
  }

 /**
 * 对下合同办公室盖章时间
 */
 private Date dxhtbgsgzsj;

 /**
 * @hibernate.property column="dxhtbgsgzsj"
 * @return Returns the dxhtbgsgzsj.
 */
 public Date getDxhtbgsgzsj() {
    return dxhtbgsgzsj;
 }

 public void setDxhtbgsgzsj(Date dxhtbgsgzsj) {
    this.dxhtbgsgzsj = dxhtbgsgzsj;
  }

 /**
 * 对上合同原件转发财务部时间
 */
 private Date dshtyjzfcwbsj;

 /**
 * @hibernate.property column="dshtyjzfcwbsj"
 * @return Returns the dshtyjzfcwbsj.
 */
 public Date getDshtyjzfcwbsj() {
    return dshtyjzfcwbsj;
 }

 public void setDshtyjzfcwbsj(Date dshtyjzfcwbsj) {
    this.dshtyjzfcwbsj = dshtyjzfcwbsj;
  }

 /**
 * 收到网络工程部转来任务通知书、器材表
 */
 private Date rwtzsqcb;

 /**
 * @hibernate.property column="rwtzsqcb"
 * @return Returns the rwtzsqcb.
 */
 public Date getRwtzsqcb() {
    return rwtzsqcb;
 }

 public void setRwtzsqcb(Date rwtzsqcb) {
    this.rwtzsqcb = rwtzsqcb;
  }

 /**
 * 领料部门
 */
 private String llbm;

 /**
 * @hibernate.property column="llbm"
 * @return Returns the llbm.
 */
 public String getLlbm() {
    return llbm;
 }

 public void setLlbm(String llbm) {
    this.llbm = llbm;
  }

 /**
 * 领料时间
 */
 private Date llsj;

 /**
 * @hibernate.property column="llsj"
 * @return Returns the llsj.
 */
 public Date getLlsj() {
    return llsj;
 }

 public void setLlsj(Date llsj) {
    this.llsj = llsj;
  }

 /**
 * 领料人
 */
 private String llr;

 /**
 * @hibernate.property column="llr"
 * @return Returns the llr.
 */
 public String getLlr() {
    return llr;
 }

 public void setLlr(String llr) {
    this.llr = llr;
  }

 /**
 * 发料人
 */
 private String flr;

 /**
 * @hibernate.property column="flr"
 * @return Returns the flr.
 */
 public String getFlr() {
    return flr;
 }

 public void setFlr(String flr) {
    this.flr = flr;
  }

 /**
 * 收到网络工程部转来补料器材表
 */
 private String bqcb;

 /**
 * @hibernate.property column="bqcb"
 * @return Returns the bqcb.
 */
 public String getBqcb() {
    return bqcb;
 }

 public void setBqcb(String bqcb) {
    this.bqcb = bqcb;
  }

 /**
 * 二次领料部门
 */
 private String llbm_2;

 /**
 * @hibernate.property column="llbm_2"
 * @return Returns the llbm_2.
 */
 public String getLlbm_2() {
    return llbm_2;
 }

 public void setLlbm_2(String llbm_2) {
    this.llbm_2 = llbm_2;
  }

 /**
 * 二次设计领料时间
 */
 private Date sjllsj_2;

 /**
 * @hibernate.property column="sjllsj_2"
 * @return Returns the sjllsj_2.
 */
 public Date getSjllsj_2() {
    return sjllsj_2;
 }

 public void setSjllsj_2(Date sjllsj_2) {
    this.sjllsj_2 = sjllsj_2;
  }

 /**
 * 二次领料人
 */
 private String llr_2;

 /**
 * @hibernate.property column="llr_2"
 * @return Returns the llr_2.
 */
 public String getLlr_2() {
    return llr_2;
 }

 public void setLlr_2(String llr_2) {
    this.llr_2 = llr_2;
  }

 /**
 * 二次发料人
 */
 private String flr_2;

 /**
 * @hibernate.property column="flr_2"
 * @return Returns the flr_2.
 */
 public String getFlr_2() {
    return flr_2;
 }

 public void setFlr_2(String flr_2) {
    this.flr_2 = flr_2;
  }

 /**
 * 接收采购申请表时间
 */
 private Date jscgsqbsj;

 /**
 * @hibernate.property column="jscgsqbsj"
 * @return Returns the jscgsqbsj.
 */
 public Date getJscgsqbsj() {
    return jscgsqbsj;
 }

 public void setJscgsqbsj(Date jscgsqbsj) {
    this.jscgsqbsj = jscgsqbsj;
  }

 /**
 * 申请部门
 */
 private String sqbm;

 /**
 * @hibernate.property column="sqbm"
 * @return Returns the sqbm.
 */
 public String getSqbm() {
    return sqbm;
 }

 public void setSqbm(String sqbm) {
    this.sqbm = sqbm;
  }

 /**
 * 公司领导批准时间
 */
 private Date gsldpzsj;

 /**
 * @hibernate.property column="gsldpzsj"
 * @return Returns the gsldpzsj.
 */
 public Date getGsldpzsj() {
    return gsldpzsj;
 }

 public void setGsldpzsj(Date gsldpzsj) {
    this.gsldpzsj = gsldpzsj;
  }

 /**
 * 采购器材到库时间
 */
 private Date cgqdksj;

 /**
 * @hibernate.property column="cgqdksj"
 * @return Returns the cgqdksj.
 */
 public Date getCgqdksj() {
    return cgqdksj;
 }

 public void setCgqdksj(Date cgqdksj) {
    this.cgqdksj = cgqdksj;
  }

 /**
 * 采购器材领料人
 */
 private String cgqllr;

 /**
 * @hibernate.property column="cgqllr"
 * @return Returns the cgqllr.
 */
 public String getCgqllr() {
    return cgqllr;
 }

 public void setCgqllr(String cgqllr) {
    this.cgqllr = cgqllr;
  }

 /**
 * N编号
 */
 private String n_bh;

 /**
 * @hibernate.property column="n_bh"
 * @return Returns the n_bh.
 */
 public String getN_bh() {
    return n_bh;
 }

 public void setN_bh(String n_bh) {
    this.n_bh = n_bh;
  }

 /**
 * 歌华协议接受日期
 */
 private Date ghxyjsrq;

 /**
 * @hibernate.property column="ghxyjsrq"
 * @return Returns the ghxyjsrq.
 */
 public Date getGhxyjsrq() {
    return ghxyjsrq;
 }

 public void setGhxyjsrq(Date ghxyjsrq) {
    this.ghxyjsrq = ghxyjsrq;
  }

 /**
 * 协议盖章返回视宽日期
 */
 private Date xygzfhskrq;

 /**
 * @hibernate.property column="xygzfhskrq"
 * @return Returns the xygzfhskrq.
 */
 public Date getXygzfhskrq() {
    return xygzfhskrq;
 }

 public void setXygzfhskrq(Date xygzfhskrq) {
    this.xygzfhskrq = xygzfhskrq;
  }

 /**
 * 添加视宽协议签订日期
 */
 private Date tjskxyqdrq;

 /**
 * @hibernate.property column="tjskxyqdrq"
 * @return Returns the tjskxyqdrq.
 */
 public Date getTjskxyqdrq() {
    return tjskxyqdrq;
 }

 public void setTjskxyqdrq(Date tjskxyqdrq) {
    this.tjskxyqdrq = tjskxyqdrq;
  }

 /**
 * 视宽协议金额
 */
 private Double skxyje;

 /**
 * @hibernate.property column="skxyje"
 * @return Returns the skxyje.
 */
 public Double getSkxyje() {
    return skxyje;
 }

 public void setSkxyje(Double skxyje) {
    this.skxyje = skxyje;
  }

 /**
 * 视宽编号
 */
 private String skbh;

 /**
 * @hibernate.property column="skbh"
 * @return Returns the skbh.
 */
 public String getSkbh() {
    return skbh;
 }

 public void setSkbh(String skbh) {
    this.skbh = skbh;
  }

 /**
 * 歌华工程编号
 */
 private String ghbh;

 /**
 * @hibernate.property column="ghbh"
 * @return Returns the ghbh.
 */
 public String getGhbh() {
    return ghbh;
 }

 public void setGhbh(String ghbh) {
    this.ghbh = ghbh;
  }


}
