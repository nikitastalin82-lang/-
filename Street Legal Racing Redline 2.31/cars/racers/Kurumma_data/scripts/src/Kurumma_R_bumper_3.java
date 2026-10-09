package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_bumper_3 extends Bumper
{
	public Kurumma_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma custom rear bumper";
		description = "Custom rear bumper for Kurumma models.";

		value = tHUF2USD(257.42);
		brand_new_prestige_value = 55.29;
	}
}
