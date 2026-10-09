package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_models extends Chassis
{
	static int	MODEL_2_5_TURBO		= 8;
	static int	MODEL_3_6_TWINTURBO	= 9;

	public Yotta_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_BAIERN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}