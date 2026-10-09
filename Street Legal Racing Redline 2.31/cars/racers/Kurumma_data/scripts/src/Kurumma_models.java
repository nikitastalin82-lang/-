package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_models extends Chassis
{
	static int	MODEL_Z3	= 4;
	static int	MODEL_Z35C	= 5;

	public Kurumma_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_MC;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}