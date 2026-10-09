package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_bumper_3 extends Bumper
{
	public Remo_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo tuner rear bumper";
		description = "Stylized rear bumper for Remo models.";

		value = tHUF2USD(190.111);
		brand_new_prestige_value = 35.18;
	}
}
