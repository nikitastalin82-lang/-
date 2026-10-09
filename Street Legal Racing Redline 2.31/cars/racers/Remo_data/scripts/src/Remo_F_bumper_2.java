package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_F_bumper_2 extends Bumper
{
	public Remo_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom front bumper";
		description = "Custom front bumper for Remo models.";

		value = tHUF2USD(139.471);
		brand_new_prestige_value = 28.20;
	}
}
