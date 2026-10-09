package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_R_bumper_2 extends Bumper
{
	public Kurumma_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma Z35C bumper";
		description = "Stock rear bumper for the Kurumma Z35C.";

		value = tHUF2USD(177.873);
		brand_new_prestige_value = 44.31;
	}
}
