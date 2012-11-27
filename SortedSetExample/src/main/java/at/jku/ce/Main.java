package at.jku.ce;

import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * This is your main entry point
 */
public class Main {

	/**
	 * Contains our logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(
				new DomainObjectComparator());
		objectSet.add(DomainFactory.createDomainObject("Helga", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Hans", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Paul", "Comment1"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Comment1"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.toString());
			LOGGER.debug(domainObject.getUuId());
		}
	}
}
