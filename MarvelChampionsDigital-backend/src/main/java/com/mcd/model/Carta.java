package com.mcd.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * The persistent class for the cartas database table.
 * 
 */
@Entity
@Table(name="cartas")
@NamedQuery(name="Carta.findAll", query="SELECT c FROM Carta c")
public class Carta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String attack;

	@Lob
	@Column(name="attack_cost")
	private String attackCost;

	@Lob
	@Column(name="back_name")
	private String backName;

	@Lob
	@Column(name="back_text")
	private String backText;

	@Lob
	private String backimagesrc;

	@Lob
	@Column(name="base_threat")
	private String baseThreat;

	@Lob
	@Column(name="base_threat_fixed")
	private String baseThreatFixed;

	@Lob
	private String boost;

	@Lob
	@Column(name="boost_text")
	private String boostText;

	@Lob
	@Column(name="card_set_code")
	private String cardSetCode;

	@Lob
	@Column(name="card_set_name")
	private String cardSetName;

	@Lob
	@Column(name="card_set_type_name_code")
	private String cardSetTypeNameCode;

	@Id
	@Lob
	private String code;

	@Lob
	private String cost;

	@Lob
	@Column(name="deck_limit")
	private String deckLimit;

	@Lob
	@Column(name="deck_options")
	private String deckOptions;

	@Lob
	@Column(name="deck_requirements")
	private String deckRequirements;

	@Lob
	private String defense;

	@Lob
	@Column(name="double_sided")
	private String doubleSided;

	@Lob
	@Column(name="duplicate_of_code")
	private String duplicateOfCode;

	@Lob
	@Column(name="duplicate_of_name")
	private String duplicateOfName;

	@Lob
	@Column(name="duplicated_by")
	private String duplicatedBy;

	@Lob
	@Column(name="escalation_threat_fixed")
	private String escalationThreatFixed;

	@Lob
	@Column(name="faction_code")
	private String factionCode;

	@Lob
	@Column(name="faction_name")
	private String factionName;

	@Lob
	private String flavor;

	@Lob
	@Column(name="hand_size")
	private String handSize;

	@Lob
	private String health;

	@Lob
	@Column(name="health_per_hero")
	private String healthPerHero;

	@Lob
	private String hidden;

	@Lob
	private String illustrator;

	@Lob
	private String imagesrc;

	@Lob
	@Column(name="is_unique")
	private String isUnique;

	@Lob
	@Column(name="linked_card")
	private String linkedCard;

	@Lob
	@Column(name="linked_to_code")
	private String linkedToCode;

	@Lob
	@Column(name="linked_to_name")
	private String linkedToName;

	@Lob
	private String meta;

	@Lob
	private String name;

	@Lob
	@Column(name="octgn_id")
	private String octgnId;

	@Lob
	@Column(name="pack_code")
	private String packCode;

	@Lob
	@Column(name="pack_name")
	private String packName;

	@Lob
	private String permanent;

	@Lob
	private String position;

	@Lob
	private String quantity;

	@Lob
	@Column(name="real_name")
	private String realName;

	@Lob
	@Column(name="real_text")
	private String realText;

	@Lob
	@Column(name="real_traits")
	private String realTraits;

	@Lob
	private String recover;

	@Lob
	@Column(name="resource_energy")
	private String resourceEnergy;

	@Lob
	@Column(name="resource_mental")
	private String resourceMental;

	@Lob
	@Column(name="resource_physical")
	private String resourcePhysical;

	@Lob
	@Column(name="resource_wild")
	private String resourceWild;

	@Lob
	private String scheme;

	@Lob
	@Column(name="scheme_acceleration")
	private String schemeAcceleration;

	@Lob
	@Column(name="scheme_crisis")
	private String schemeCrisis;

	@Lob
	@Column(name="scheme_hazard")
	private String schemeHazard;

	@Lob
	@Column(name="set_position")
	private String setPosition;

	@Lob
	private String subname;

	@Lob
	private String text;

	@Lob
	@Column(name="threat_fixed")
	private String threatFixed;

	@Lob
	private String thwart;

	@Lob
	@Column(name="thwart_cost")
	private String thwartCost;

	@Lob
	private String traits;

	@Lob
	@Column(name="type_code")
	private String typeCode;

	@Lob
	@Column(name="type_name")
	private String typeName;

	@Lob
	private String url;

	public Carta() {
	}

	public String getAttack() {
		return this.attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getAttackCost() {
		return this.attackCost;
	}

	public void setAttackCost(String attackCost) {
		this.attackCost = attackCost;
	}

	public String getBackName() {
		return this.backName;
	}

	public void setBackName(String backName) {
		this.backName = backName;
	}

	public String getBackText() {
		return this.backText;
	}

	public void setBackText(String backText) {
		this.backText = backText;
	}

	public String getBackimagesrc() {
		return this.backimagesrc;
	}

	public void setBackimagesrc(String backimagesrc) {
		this.backimagesrc = backimagesrc;
	}

	public String getBaseThreat() {
		return this.baseThreat;
	}

	public void setBaseThreat(String baseThreat) {
		this.baseThreat = baseThreat;
	}

	public String getBaseThreatFixed() {
		return this.baseThreatFixed;
	}

	public void setBaseThreatFixed(String baseThreatFixed) {
		this.baseThreatFixed = baseThreatFixed;
	}

	public String getBoost() {
		return this.boost;
	}

	public void setBoost(String boost) {
		this.boost = boost;
	}

	public String getBoostText() {
		return this.boostText;
	}

	public void setBoostText(String boostText) {
		this.boostText = boostText;
	}

	public String getCardSetCode() {
		return this.cardSetCode;
	}

	public void setCardSetCode(String cardSetCode) {
		this.cardSetCode = cardSetCode;
	}

	public String getCardSetName() {
		return this.cardSetName;
	}

	public void setCardSetName(String cardSetName) {
		this.cardSetName = cardSetName;
	}

	public String getCardSetTypeNameCode() {
		return this.cardSetTypeNameCode;
	}

	public void setCardSetTypeNameCode(String cardSetTypeNameCode) {
		this.cardSetTypeNameCode = cardSetTypeNameCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getDeckLimit() {
		return this.deckLimit;
	}

	public void setDeckLimit(String deckLimit) {
		this.deckLimit = deckLimit;
	}

	public String getDeckOptions() {
		return this.deckOptions;
	}

	public void setDeckOptions(String deckOptions) {
		this.deckOptions = deckOptions;
	}

	public String getDeckRequirements() {
		return this.deckRequirements;
	}

	public void setDeckRequirements(String deckRequirements) {
		this.deckRequirements = deckRequirements;
	}

	public String getDefense() {
		return this.defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	public String getDoubleSided() {
		return this.doubleSided;
	}

	public void setDoubleSided(String doubleSided) {
		this.doubleSided = doubleSided;
	}

	public String getDuplicateOfCode() {
		return this.duplicateOfCode;
	}

	public void setDuplicateOfCode(String duplicateOfCode) {
		this.duplicateOfCode = duplicateOfCode;
	}

	public String getDuplicateOfName() {
		return this.duplicateOfName;
	}

	public void setDuplicateOfName(String duplicateOfName) {
		this.duplicateOfName = duplicateOfName;
	}

	public String getDuplicatedBy() {
		return this.duplicatedBy;
	}

	public void setDuplicatedBy(String duplicatedBy) {
		this.duplicatedBy = duplicatedBy;
	}

	public String getEscalationThreatFixed() {
		return this.escalationThreatFixed;
	}

	public void setEscalationThreatFixed(String escalationThreatFixed) {
		this.escalationThreatFixed = escalationThreatFixed;
	}

	public String getFactionCode() {
		return this.factionCode;
	}

	public void setFactionCode(String factionCode) {
		this.factionCode = factionCode;
	}

	public String getFactionName() {
		return this.factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getHandSize() {
		return this.handSize;
	}

	public void setHandSize(String handSize) {
		this.handSize = handSize;
	}

	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getHealthPerHero() {
		return this.healthPerHero;
	}

	public void setHealthPerHero(String healthPerHero) {
		this.healthPerHero = healthPerHero;
	}

	public String getHidden() {
		return this.hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getIllustrator() {
		return this.illustrator;
	}

	public void setIllustrator(String illustrator) {
		this.illustrator = illustrator;
	}

	public String getImagesrc() {
		return this.imagesrc;
	}

	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}

	public String getIsUnique() {
		return this.isUnique;
	}

	public void setIsUnique(String isUnique) {
		this.isUnique = isUnique;
	}

	public String getLinkedCard() {
		return this.linkedCard;
	}

	public void setLinkedCard(String linkedCard) {
		this.linkedCard = linkedCard;
	}

	public String getLinkedToCode() {
		return this.linkedToCode;
	}

	public void setLinkedToCode(String linkedToCode) {
		this.linkedToCode = linkedToCode;
	}

	public String getLinkedToName() {
		return this.linkedToName;
	}

	public void setLinkedToName(String linkedToName) {
		this.linkedToName = linkedToName;
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOctgnId() {
		return this.octgnId;
	}

	public void setOctgnId(String octgnId) {
		this.octgnId = octgnId;
	}

	public String getPackCode() {
		return this.packCode;
	}

	public void setPackCode(String packCode) {
		this.packCode = packCode;
	}

	public String getPackName() {
		return this.packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getPermanent() {
		return this.permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRealText() {
		return this.realText;
	}

	public void setRealText(String realText) {
		this.realText = realText;
	}

	public String getRealTraits() {
		return this.realTraits;
	}

	public void setRealTraits(String realTraits) {
		this.realTraits = realTraits;
	}

	public String getRecover() {
		return this.recover;
	}

	public void setRecover(String recover) {
		this.recover = recover;
	}

	public String getResourceEnergy() {
		return this.resourceEnergy;
	}

	public void setResourceEnergy(String resourceEnergy) {
		this.resourceEnergy = resourceEnergy;
	}

	public String getResourceMental() {
		return this.resourceMental;
	}

	public void setResourceMental(String resourceMental) {
		this.resourceMental = resourceMental;
	}

	public String getResourcePhysical() {
		return this.resourcePhysical;
	}

	public void setResourcePhysical(String resourcePhysical) {
		this.resourcePhysical = resourcePhysical;
	}

	public String getResourceWild() {
		return this.resourceWild;
	}

	public void setResourceWild(String resourceWild) {
		this.resourceWild = resourceWild;
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getSchemeAcceleration() {
		return this.schemeAcceleration;
	}

	public void setSchemeAcceleration(String schemeAcceleration) {
		this.schemeAcceleration = schemeAcceleration;
	}

	public String getSchemeCrisis() {
		return this.schemeCrisis;
	}

	public void setSchemeCrisis(String schemeCrisis) {
		this.schemeCrisis = schemeCrisis;
	}

	public String getSchemeHazard() {
		return this.schemeHazard;
	}

	public void setSchemeHazard(String schemeHazard) {
		this.schemeHazard = schemeHazard;
	}

	public String getSetPosition() {
		return this.setPosition;
	}

	public void setSetPosition(String setPosition) {
		this.setPosition = setPosition;
	}

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getThreatFixed() {
		return this.threatFixed;
	}

	public void setThreatFixed(String threatFixed) {
		this.threatFixed = threatFixed;
	}

	public String getThwart() {
		return this.thwart;
	}

	public void setThwart(String thwart) {
		this.thwart = thwart;
	}

	public String getThwartCost() {
		return this.thwartCost;
	}

	public void setThwartCost(String thwartCost) {
		this.thwartCost = thwartCost;
	}

	public String getTraits() {
		return this.traits;
	}

	public void setTraits(String traits) {
		this.traits = traits;
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}