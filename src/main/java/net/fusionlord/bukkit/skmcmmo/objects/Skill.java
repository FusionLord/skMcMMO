package net.fusionlord.bukkit.skmcmmo.objects;

import com.gmail.nossr50.datatypes.skills.SkillType;

public class Skill
{

	private SkillType skill;
	private int       skillLevel;

	public Skill(SkillType skill, int skillLevel)
	{
		this.skill = skill;
		this.skillLevel = skillLevel;
	}

	public String getSkillName()
	{
		return skill.getName();
	}

	public int getSkillLevel()
	{
		return skillLevel;
	}
}
