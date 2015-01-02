package net.fusionlord.bukkit.skmcmmo.classes;

import ch.njol.skript.classes.ClassInfo;
import ch.njol.skript.classes.Parser;
import ch.njol.skript.classes.Serializer;
import ch.njol.skript.lang.ParseContext;
import ch.njol.skript.registrations.Classes;
import ch.njol.yggdrasil.Fields;
import com.gmail.nossr50.datatypes.skills.SkillType;

import javax.annotation.Nullable;
import java.io.NotSerializableException;
import java.io.StreamCorruptedException;

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
				new ClassInfo<Skill>(Skill.class, "skill")
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
										return null;//new Skill();
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
							public Fields serialize(Skill skill)
							{
								Fields f = new Fields();
								f.putObject("name", skill.getSkillName());
								f.putObject("level", skill.getSkillLevel());
								return f;
							}

							@Override
							public void deserialize(Skill o, Fields f) throws StreamCorruptedException, NotSerializableException
							{
								assert false;
							}

							@Override
							public Skill deserialize(final Fields f) throws StreamCorruptedException
							{
								Skill s = new Skill(
										SkillType.getSkill((String) f.getObject("name")), (int) f.getObject(
										"level"
								)
								);
								return s;
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

	public String toString()
	{
		return "Skill:" + skill.getName() + ", " + skillLevel;
	}
}
