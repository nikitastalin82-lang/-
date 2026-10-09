package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_F_bumper_3 extends Bumper
{
	public Kurumma_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma custom front bumper";
		description = "Custom front bumper for Kurumma models.";

		value = tHUF2USD(284.85);
		brand_new_prestige_value = 55.29;
	}
}
