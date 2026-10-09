package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_F_bumper_3 extends Bumper
{
	public Whisper_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper tuner front bumper";
		description = "Stylized front bumper for Whisper models.";

		value = tHUF2USD(706.85);
		brand_new_prestige_value = 70.36;
	}
}
