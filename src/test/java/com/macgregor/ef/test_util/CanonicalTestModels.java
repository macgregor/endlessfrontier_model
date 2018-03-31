package com.macgregor.ef.test_util;

import com.macgregor.ef.model.canonical.*;

import java.util.Arrays;
import java.util.Collections;

public final class CanonicalTestModels {

    public static Unit getUnit() {
        Unit unit = new Unit();
        unit.setId(2021);
        unit.setTribe(5);
        unit.setClassName("Mamon");
        unit.setName("지옥의 군주 마몬");
        unit.setUnitShopMedalCost(0);
        unit.setUnitShopGemCost(-1);
        unit.setEvolveGemCost(-1);
        unit.setHonorShopCoinCost(0);
        unit.setRare(10);
        unit.setSize(4);
        unit.setEvolutionUnit(null);
        unit.setBasicAttackType("melee");
        unit.setAirUnit(false);
        unit.setBasicAttackDamageType("magical");
        unit.setHasSkill(true);
        unit.setSkillAttackType("N");
        unit.setSkillAttackDamageType("N");
        unit.setInitHp(9380.0f);
        unit.setIncHp(938.0f);
        unit.setInitDamage(5.0f);
        unit.setIncDamage(0.5f);
        unit.setInitPhyDef(20.0f);
        unit.setIncPhyDef(2.0f);
        unit.setInitMagDef(20.0f);
        unit.setIncMagDef(2.0f);
        unit.setNumUnitBlock(0);
        unit.setMoveSpeed(0.97f);
        unit.setBasicAttackSpeed(95);
        unit.setSkillAttackSpeed(120);
        unit.setBasicAttackRange(620);
        unit.setSkillAttackRange(400);
        unit.setEvadePercent(0.1f);
        unit.setBlockPercent(0.1f);
        unit.setCriticalPercent(0.2f);
        unit.setCriticalDamage(0.5f);
        unit.setSplashRange(0);
        unit.setSplashDamage(0.0f);
        unit.setSpecialSkill(1);
        unit.setPassiveSkill(0);
        unit.setReviveTime(1500);
        unit.setBloody(true);
        unit.setExplodeDie(false);
        unit.setDes("AA");
        unit.setMessage("BB");
        unit.setUnitSkillList(Collections.emptyList());
        unit.setUnitSkillListModifiers(Collections.singletonList(0));
        unit.setRank(6);
        unit.setSex("N");
        unit.setOrthoGrade(false);
        unit.setShop(0);
        unit.setShowBook(false);
        unit.setRatingPosition(0);
        unit.setMaxTransLevel(0);
        unit.setTransMaterialT1(Collections.singletonList(0));
        unit.setTransMaterialT2(Collections.singletonList(0));
        unit.setTransMaterialT3(Collections.singletonList(0));
        unit.setMedalBuff(0);
        unit.setJewelBuff(0);
        unit.setGroundAir(false);
        unit.setOfflineMarchSpeedBuff(0.0f);
        unit.setOfflineTime(0);
        unit.setHasHeart(false);
        unit.setCanDetectCloaked(false);
        unit.setCloaking(false);
        unit.setMedalBuffFromPet(0);
        unit.setHonor(false);
        unit.setHonorRotationNumber(0);

        return unit;
    }

    public static Unit getTranslatedUnit(){
        Unit unit = CanonicalTestModels.getUnit();
        unit.setName("success");
        unit.setMessage("success");
        return unit;
    }

    public static Tribe getTribe(){
        Tribe tribe = new Tribe();
        tribe.setId(1);
        tribe.setName("human");
        return tribe;
    }

    public static Pet getPet(){
        Pet pet = new Pet();
        pet.setId(1);
        pet.setClassName("Mambo");
        pet.setName("맘보");
        pet.setTribe(1);
        pet.setType("ground");
        pet.setRank(1);
        pet.setValue1(Arrays.asList(300f,800f,3000f,8000f,15000f));
        pet.setValue2(Arrays.asList(3,6,9,12,15));
        pet.setValue3(Arrays.asList(0,0,0,0,0));
        pet.setCouple(14);
        pet.setPetPointsPerRank(Arrays.asList(2,4,6,8,10));
        pet.setArtifact(null);
        pet.setPercent(true);
        pet.setAlpha(false);

        PetSkill skill1 = new PetSkill();
        skill1.setId(1);
        skill1.setNamedId("QGU");
        skill1.setName("골드부스터");
        skill1.setSub(false);
        skill1.setType("GOLD");
        skill1.setDesc("퀘스트 골드버프를 증가시킴");
        skill1.setMisc(Arrays.asList(4,16,64,256,1024,4096));
        pet.setSkill1(skill1);

        PetSkill skill2 = new PetSkill();
        skill2.setId(102);
        skill2.setNamedId("GWHU_H");
        skill2.setType("GW");
        skill2.setDesc("길드전에서 인간 병사의 체력을 증가시킴");
        pet.setSkill2(skill2);

        PetSkill skill3 = new PetSkill();
        skill3.setId(291);
        skill3.setNamedId("GOLEM_MASTER");
        skill3.setName("도탑용, 길드워");
        skill3.setDesc("- 체력이 30%이하일 경우, 모든 감소스킬( 빙결, 드루이드 넝쿨, 리치의 마비 등 )에 면역이 된다. \n" +
                "- 첫번째 공격목표에게 빠르게 순간이동( 대쉬 ) 하고, 전투에 빠르게 출진한다.  \n" +
                "- 모든 병사의 체력과 방어력을 10% 증가시킨다.");
        pet.setMasterSkill(skill3);

        return pet;
    }

    public static Pet getTranslatedPet(){
        Pet pet = CanonicalTestModels.getPet();
        pet.setName("success");
        return pet;
    }

    public static PetSkill getPetSkill(){
        PetSkill petSkill = new PetSkill();
        petSkill.setId(514);
        petSkill.setNamedId("OFR");
        petSkill.setName("Orc FriendShip Up");
        petSkill.setType("SUPPORT");
        petSkill.setDesc("오크종족의 우호도 증가");
        petSkill.setSub(null);
        petSkill.setMisc(Collections.EMPTY_LIST);

        return petSkill;
    }

    public static PetSkill getTranslatedPetSkill(){
        PetSkill petSkill = CanonicalTestModels.getPetSkill();
        petSkill.setDesc("success");
        return petSkill;
    }

    public static Artifact getArtifact(){
        Artifact artifact = new Artifact();
        artifact.setId(29);
        artifact.setName("늑대가죽 부츠");
        artifact.setMainCode("S");
        artifact.setSubCode(2);
        artifact.setRank(3);
        artifact.setBaseMaxLevel(20);
        artifact.setDesc("언데드,오크 병사출진 시간감소|던전보스 체력감소|");
        artifact.setOpenCost(Arrays.asList(10000L,10000L,0L,0L,0L));
        artifact.setAbilityCode1("unitBattleTime_UO");
        artifact.setAbility1(77);
        artifact.setAbility11(0);
        artifact.setAbility21(0);
        artifact.setAbilityCode2("dungeonBossHp_A");
        artifact.setAbility2(77);
        artifact.setAbility12(0);
        artifact.setAbility22(0);
        artifact.setAbilityCode3(null);
        artifact.setAbility3(0);
        artifact.setUpgradeCostType(3);
        artifact.setShowDesc(true);
        artifact.setSortId(29);

        return artifact;
    }

    public static Artifact getTranslatedArtifact(){
        Artifact artifact = CanonicalTestModels.getArtifact();
        artifact.setDesc("success");
        artifact.setName("success");
        return artifact;
    }

    public static ArtifactSet getArtifactSet(){
        ArtifactSet artifactSet = new ArtifactSet();
        artifactSet.setId(1);
        artifactSet.setName("음양 정령도 세트");
        artifactSet.setNumPiecesRequiedForSetBonusTiers(Arrays.asList(2));
        artifactSet.setAbilityCodes(Arrays.asList("questGoldGain_A","attackSpeed_A"));
        artifactSet.setValueList(Arrays.asList("3725","6"));
        artifactSet.setValueList1(Arrays.asList("2880000","7"));
        artifactSet.setValueList2(Arrays.asList("4425000","8"));
        artifactSet.setDesc("퀘스트 골드획득 증가#공격속도 증가");
        artifactSet.setHistory(null);
        artifactSet.setShowDesc(true);


        Artifact a1 = new Artifact();
        a1.setId(47);
        a1.setName("음의 서리도");
        a1.setMainCode("W");
        a1.setSubCode(4);
        a1.setRank(5);
        a1.setBaseMaxLevel(20);
        a1.setDesc("오크 공격력증가|\n" +
                "                오크 치명타데미지 증가");
        a1.setOpenCost(Arrays.asList(0L,30000000L,30000000L,0L,0L));
        a1.setAbilityCode1("damage_O");
        a1.setAbility1(15);
        a1.setAbility11(122);
        a1.setAbility21(251);
        a1.setAbilityCode2("criticalDamage_O");
        a1.setAbility2(25);
        a1.setAbility12(180);
        a1.setAbility22(270);
        a1.setAbilityCode3(null);
        a1.setAbility3(0);
        a1.setUpgradeCostType(5);
        a1.setShowDesc(true);
        a1.setSortId(47);

        Artifact a2 = new Artifact();
        a2.setId(48);
        a2.setName("양의 불꽃도");
        a2.setMainCode("W");
        a2.setSubCode(5);
        a2.setRank(5);
        a2.setBaseMaxLevel(20);
        a2.setDesc("언데드 공격력증가|\n" +
                "                언데드 치명타데미지 증가");
        a2.setOpenCost(Arrays.asList(0L,0L,30000000L,30000000L,0L));
        a2.setAbilityCode1("damage_U");
        a2.setAbility1(15);
        a2.setAbility11(122);
        a2.setAbility21(251);
        a2.setAbilityCode2("criticalDamage_U");
        a2.setAbility2(25);
        a2.setAbility12(180);
        a2.setAbility22(270);
        a2.setAbilityCode3(null);
        a2.setAbility3(0);
        a2.setUpgradeCostType(5);
        a2.setShowDesc(true);
        a2.setSortId(48);

        artifactSet.setArtifactList(Arrays.asList(a1,a2));

        return artifactSet;
    }

    public static ArtifactSet getTranslatedArtifactSet(){
        ArtifactSet artifactSet = CanonicalTestModels.getArtifactSet();
        artifactSet.setName("success");
        artifactSet.setDesc("success");
        return artifactSet;
    }

    public static UnitSkill getUnitSkill(){
        UnitSkill unitSkill = new UnitSkill();
        unitSkill.setId(11);
        unitSkill.setSkillCode("THU");
        unitSkill.setImgIndex(9);
        unitSkill.setBaseValue(1);
        unitSkill.setDesc("자기종족 체력 증가");

        return unitSkill;
    }

    public static UnitSkill getTranslatedUnitSkill(){
        UnitSkill unitSkill = CanonicalTestModels.getUnitSkill();
        unitSkill.setDesc("success");
        return unitSkill;
    }

    public static Translation getTranslation(){
        Translation translation = new Translation();
        translation.setId("ACHIEVE_DESC_2");
        translation.setValue("Maximum Unit Number");

        return translation;
    }
}
