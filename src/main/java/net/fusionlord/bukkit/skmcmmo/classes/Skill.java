package net.fusionlord.bukkit.skmcmmo.classes;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.classes.Serializer;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.registrations.Classes;
import com.gmail.nossr50.datatypes.skills.SkillType;

import javax.annotation.Nullable;

public class Skill
{

	private SkillType skill;
	private int       skillLevel;

	public Skill(SkillType skill, int skillLevel)
	{
		this.skill = skill;
		this.skillLevel = skillLevel;
	}

	public static void register()
	{
		Classes.registerClass(
				new ClassInfo<>(Skill.class, "skill")
						.user("skill")
						.name("McMMO Skill")
						.description("McMMO Skill")
						.usage("...")
						.examples("")
						.since("1.0")
						.parser(
								new Parser<Skill>()
								{
									@Nullable
									public Skill parse(String s, ParseContext context)
									{
										//return RegionsUtils.get(s);
										return null;
									}

									public boolean canParse(ParseContext context)
									{
										return false;
									}

									public String toVariableNameString(Skill skill)
									{
										StringBuilder b = new StringBuilder("skill:");
										String name = skill.getSkillName();
										String level = Integer.toString(skill.getSkillLevel());
										if (name == null)
										{
											return null;
										}
										b.append(name);
										b.append(",");
										b.append(level);
										return b.toString();
									}

									public String getVariableNamePattern()
									{
										return "skill:.+";
									}

									public String toString(Skill skill, int flags)
									{
										return skill.getSkillName();
									}
								}
						).serializer(
						new Serializer<Skill>()
						{
							@Override
							public boolean mustSyncDeserialization()
							{
								return true;
							}

							@Override
							public String serialize(Skill skill)
							{
								return String.format("skill:%s,%s", skill.getSkillName(), skill.getSkillLevel());
							}

							@Override
							public Skill deserialize(final String x)
							{
								String d = x.replaceAll("skill:", "");
								String[] t = d.split(",");
								SkillType skillType = SkillType.getSkill(t[0]);
								return new Skill(skillType, Integer.parseInt(t[1]));
							}
						}
				)
		);
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
