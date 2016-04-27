import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HumanRightsForm extends JDialog {
    private JPanel panel1;
    private JTextArea textArea1HumanRights;
    private JTextArea textArea2AboutCountry;
    private JComboBox comboBox1Country;
    private JLabel ImageLabel;
    private JScrollBar scrollBarVertical;
    private JScrollBar scrollBar1Horizontal;
    private JLabel CountryFlag;
    private JLabel ProjectLogo;

    public HumanRightsForm () {
        setContentPane(panel1);
        setModal(true);


        comboBox1Country.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object obj = e.getItem();
                String selected = comboBox1Country.getSelectedItem().toString();
                if (selected == "Bosnia and Herzegovina") {
                    textArea2AboutCountry.setText("General facts about the Country:Bosnia and Herzegovina \n" +
                            " sovereignty in October 1991 and independence from the former Yugoslavia on 3 March \n" +
                            "1992 after a referendum boycotted by ethnic Serbs. The Bosnian Serbs - supported by\n" +
                            " neighboring Serbia and Montenegro - responded with armed resistance aimed at \n" +
                            "partitioning the republic along ethnic lines and joining Serb-held areas to form a \n" +
                            "\"Greater Serbia.\" In March 1994, Bosniaks and Croats reduced the number of warring\n" +
                            " factions from three to two by signing an agreement creating a joint Bosniak-Croat \n" +
                            "Federation of Bosnia and Herzegovina. On 21 November 1995, in Dayton, Ohio, the warring\n" +
                            " parties initialed a peace agreement that ended three years of interethnic civil strife\n" +
                            " (the final agreement was signed in Paris on 14 December 1995).\n" +
                            "The Dayton Peace Accords retained Bosnia and Herzegovina's international boundaries and \n" +
                            "created a multiethnic and democratic government charged with conducting foreign, \n" +
                            "diplomatic, and fiscal policy. Also recognized was a second tier of government composed\n" +
                            " of two entities roughly equal in size: the predominantly Bosniak-Bosnian Croat Federation\n" +
                            " of Bosnia and Herzegovina and the predominantly Bosnian Serb-led Republika Srpska (RS).\n" +
                            " The Federation and RS governments are responsible for overseeing most government functions.\n" +
                            " Additionally, the Dayton Accords established the Office of the High Representative to \n" +
                            "oversee the implementation of the civilian aspects of the agreement. The Peace Implementation\n" +
                            " Council at its conference in Bonn in 1997 also gave the High Representative the authority to\n" +
                            " impose legislation and remove officials, the so-called \"Bonn Powers.\" An original NATO-led\n" +
                            " international peacekeeping force (IFOR) of 60,000 troops assembled in 1995 was succeeded over\n" +
                            " time by a smaller, NATO-led Stabilization Force (SFOR). In 2004, European Union peacekeeping\n" +
                            " troops (EUFOR) replaced SFOR. Currently EUFOR deploys around 600 troops in theater in a \n" +
                            "security assistance and training capacity.\n" +
                            "Note: within Bosnia and Herzegovina's recognized borders, the country is divided into a \n" +
                            "joint Bosniak/Croat Federation (about 51% of the territory) and the Bosnian Serb-led Republik0a\n" +
                            " Srpska or RS (about 49% of the territory); the region called Herzegovina is contiguous to \n" +
                            "Croatia and Montenegro, and traditionally has been settled by an ethnic Croat majority in \n" +
                            "the west and an ethnic Serb majority in the east.\n " +
                            "Ethnic groups:\n" +
                            "Bosniak 48.4%, Serb 32.7%, Croat 14.6%, other 4.3%\n" +
                            "note: final 2013 census results are pending; Bosniak has replaced Muslim as an ethnic term \n" +
                            "in part to avoid confusion with the religious term Muslim - an adherent of Islam (2013 est.)\n" +
                            "Languages:\n" +
                            "Bosnian (official), Croatian (official), Serbian (official)\n" +
                            "Religions:\n" +
                            "Muslim 40%, Orthodox 31%, Roman Catholic 15%, other 14%\n" +
                            "Population:\n" +
                            "3,867,055 (July 2015 est.)\n" +
                            "Death rate:\n" +
                            "9.75 deaths/1,000 population (2015 est.)\n" +
                            "Mother's mean age at first birth:\n" +
                            "26.3 (2011 est.)\n" +
                            "Child labor - children ages 5-14:\n" +
                            "total number: 24,722\n" +
                            "percentage: 5% (2006 est.)\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 62.8%\n" +
                            "male: 62.8%\n" +
                            "female: 62.8% (2012 est.)\n" +
                            "Government type:\n" +
                            "federal democratic republic\n" +
                            "Capital:\n" +
                            "name: Sarajevo\n" +
                            "International law organization participation:\n" +
                            "has not submitted an ICJ jurisdiction declaration; accepts ICCt jurisdiction\n");
                    textArea1HumanRights.setText("State of Human Rights: " +
                            "Freedom of expression\n" +
                            "In February, the National Assembly of Republika Srpska adopted a Law on Public Peace and Order that brought the internet and social networks into its definition of “public space”. Concerns were raised by NGOs and the OSCE Representative on Freedom of the Media over the possibility of individuals being prosecuted for their online activities, on charges of breaching public peace and order.\n" +
                            "Threats and attacks against journalists persisted. In October, an arson attack was carried out on the car of a journalist from a local radio station. Targeted cyber attacks on news websites continued. Only 15% of court cases relating to attacks against journalists were resolved in the past 10 years.\n" +
                            "Discrimination\n" +
                            "The 2009 judgment of the European Court of Human Rights in the case of Sejdić-Finci v. BiH, which found the power-sharing arrangements set out in the Constitution to be discriminatory, remained unimplemented. Under the arrangements, citizens such as Jews and Roma who do not declare themselves as belonging to one of the three constituent peoples of the country (Bosniaks, Serbs and Croats) are excluded from running for legislative and executive office. In June, the implementation of the judgment was removed as a requirement for the signing of the SAA, leaving little hope of the decision being implemented.\n" +
                            "Crimes under international law\n" +
                            "Proceedings continued at the International Criminal Tribunal for the former Yugoslavia against former General Ratko Mladić for genocide, crimes against humanity and violations of the laws or customs of war, including at Srebrenica. A verdict in the case against former Bosnian Serb leader Radovan Karadzić was still pending at the end of the year.\n" +
                            "In May, the Parliamentary Assembly of Bosnia and Herzegovina adopted a set of amendments to the Criminal Code. The amendments introduced enforced disappearance as a separate crime and provided a clearer definition of acts of torture. Additionally, the amendments aligned the definition of war crimes of sexual violence with international standards by excluding the need to demonstrate use of force as a requirement to qualify the crime as such. However, entity courts and courts in the Brčko District continued to apply the former Criminal Code, leading to the ineffective prosecution of such crimes at the sub-state level, to which cases were increasingly being transferred.\n" +
                            "Legislation that would enable effective reparation, including a comprehensive programme for victims of crimes under international law, and free legal aid services to victims of torture and civilian victims of war, remained absent. The harmonization of entity laws regulating the rights of civilian victims of war was still not completed.\n" +
                            "About half of the over 500 people who were charged with war crimes in the past 10 years were indicted in the last two years. However, this notable progress was halted by the EU decision to stop funding the cost of services and courts prosecuting war crimes until the new Justice Sector Reform Strategy for 2014-2018 was adopted in September. The process was delayed as Republika Srpska, unlike the country’s other two political units, refused to adopt the Strategy. In December, it announced its decision to suspend co-operation with the State Court of Bosnia and Herzegovina, further limiting effective investigations into and prosecutions of those suspected of responsibility for war crimes and who may be hiding on Republika Srpska territory.1 An agreement on a joint action plan to implement the Strategy was still pending at the end of the year.\n" +
                            "In June, a Bosnian court granted the first ever financial compensation to a victim of wartime rape and sentenced the perpetrators, two former Bosnian Serb soldiers, to 10-year prison sentences. Previously, victims were required to pursue compensation claims in civil proceedings, which required them to reveal their identity.\n" +
                            "In November, the heads of the Serbian and Bosnian governments signed a protocol on co-operation in the search for missing persons. In BiH, over 8,000 people remained missing from the war.\n" );
                    ImageLabel.setIcon(new ImageIcon("images/bosnia-map.gif"));
                    CountryFlag.setIcon(new ImageIcon("images/bk-lgflag.gif"));
                    ProjectLogo.setIcon(new ImageIcon("images/Human_Rights_2014_Icon_small.png"));
                } else if (selected == "Germany") {
                    textArea2AboutCountry.setText("General facts about the Country: As Europe's largest \n" +
                            "economy and second most populous nation (after Russia), Germany is a key \n" +
                            "member of the continent's economic, political, and defense organizations. \n" +
                            "European power struggles immersed Germany in two devastating World Wars in \n" +
                            "the first half of the 20th century and left the country occupied by the victorious\n" +
                            " Allied powers of the US, UK, France, and the Soviet Union in 1945. With the \n" +
                            "advent of the Cold War, two German states were formed in 1949: the western \n" +
                            "Federal Republic of Germany (FRG) and the eastern German Democratic Republic (GDR).\n" +
                            " The democratic FRG embedded itself in key Western economic and security organizations,\n" +
                            " the EC, which became the EU, and NATO, while the communist GDR was on the front line of\n" +
                            " the Soviet-led Warsaw Pact. The decline of the USSR and the end of the Cold War allowed\n" +
                            " for German unification in 1990. Since then, Germany has expended considerable funds to \n" +
                            "bring Eastern productivity and wages up to Western standards. In January 1999, Germany \n" +
                            "and 10 other EU countries introduced a common European exchange currency, the euro." +
                            "Ethnic groups:\n" +
                            "German 91.5%, Turkish 2.4%, other 6.1% (made up largely of Greek, Italian, Polish, Russian,\n" +
                            " Serbo-Croatian, Spanish)\n" +
                            "Languages:\n" +
                            "German (official)\n" +
                            "note: Danish, Frisian, Sorbian, and Romany are official minority languages; Low German, Danish,\n" +
                            " North Frisian, Sater Frisian, Lower Sorbian, Upper Sorbian, and Romany are recognized \n" +
                            "as regional languages under the European Charter for Regional or Minority Languages\n" +
                            "Religions:\n" +
                            "Protestant 34%, Roman Catholic 34%, Muslim 3.7%, unaffiliated or other 28.3%\n" +
                            "Population:\n" +
                            "80,854,408 (July 2015 est.)\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 7.9%\n" +
                            "male: 8.6%\n" +
                            "female: 7.1% (2013 est.)\n" +
                            "Death rate:\n" +
                            "11.42 deaths/1,000 population (2015 est.)\n" +
                            "Mother's mean age at first birth:\n" +
                            "29.2 (2012 est.)\n" +
                            "Government type:\n" +
                            "federal republic\n" +
                            "Capital:\n" +
                            "name: Berlin\n");
                    textArea1HumanRights.setText("State of Human Rights: " +
                            "Refugees and asylum-seekers\n" +
                            "\n" +
                            "The influx of asylum-seekers, mostly from Syria, Iraq and Afghanistan, increased considerably in the second half of the year, from already high levels. By the end of the year Germany had received around 1.1 million asylum-seekers. In August, Prime Minister Angela Merkel highlighted the necessity to address the needs of incoming refugees; invited other European leaders to share responsibility for people seeking protection in Europe; and decided to consider asylum applications submitted by tens of thousands of Syrians arriving in Germany through countries such as Hungary and Austria, rather than seeking their return to the first EU country they entered – a measure that was enforced for about three months. By the end of the year, 476,649 asylum applications had been submitted. Germany contributed to the EU schemes for resettlement and relocation by pledging 1,600 and 27,555 places respectively.\n" +
                            "\n" +
                            "In July, a new law improved the legal status of resettled refugees, including by facilitating family reunification, but increased powers to detain asylum-seekers under the Dublin Regulation and those whose asylum application had been rejected. The amended Asylum Seekers Benefits Act, in force since April, fell short of human rights standards, particularly regarding access to health care. A new law passed in October expanded the list of safe countries of origin to include Kosovo, Albania and Montenegro, thus limiting the opportunity for nationals of these countries to seek protection. The law also introduced severe cuts to benefits set out in the Asylum Seekers Benefits Act for rejected asylum-seekers remaining in Germany in breach of an order to leave the country – or anyway remaining without legal status – and for asylum-seekers who moved to Germany despite having been relocated to another European country.\n" +
                            "\n" +
                            "Torture and other ill-treatment\n" +
                            "\n" +
                            "The authorities continued to fail to effectively investigate allegations of ill-treatment by police and did not establish any independent complaints mechanism to investigate those allegations. The obligation for police officers to wear identity badges was not extended beyond the federal states of Berlin, Brandenburg, Rhineland-Palatinate, Bremen, Hessen and Schleswig-Holstein.\n" +
                            "\n" +
                            "The National Agency for the Prevention of Torture, Germany’s preventive mechanism under the Optional Protocol to the UN Convention against Torture, remained severely under-resourced. The appointment procedure for the National Agency’s members continued to fall short of international standards on independence and transparency, and excluded civil society representatives.\n" +
                            "\n" +
                            "In May, national media reported on the alleged abuse of two Afghan and Moroccan refugees in the holding cells of the federal police at Hannover’s main train station in 2014. Investigations against a federal police officer were ongoing at the end of the year.\n" +
                            "\n" +
                            "Discrimination\n" +
                            "\n" +
                            "On 27 January, the Constitutional Court found that the prohibition on teachers wearing religious symbols and dress, with the exception of those expressing Christian or Western values, which was in force in North-Rhine Westphalia since 2006, was discriminatory. Similar prohibitions remained in force in other German states.\n" +
                            "\n" +
                            "Opposition to refugees, asylum-seekers and migrants, particularly Muslims, resulted in hundreds of protests being staged across the country. Hate crimes against refugees, asylum-seekers and migrants increased sharply. According to the government, 113 violent attacks against asylum shelters were perpetrated in the first 10 months of the year, compared with 29 in 2014.\n" +
                            "\n" +
                            "The Federal Parliament considered an amendment to Section 46 of the Criminal Code, which, if passed, would require courts to take into account a racist or xenophobic motivation when deciding sentences.\n" +
                            "\n" +
                            "In June, the UN Committee on the Elimination of Racial Discrimination highlighted the authorities’ failure to investigate the racial motivation of offences, including in relation to murders perpetrated by the far-right group National Socialist Underground (NSU) against members of ethnic minorities. Moreover, the Committee raised concerns regarding the discriminatory impact of police stop-and-search powers on ethnic minorities.\n" +
                            "\n" +
                            "Several proceedings regarding the alleged discriminatory impact of identity checks carried out by federal police under Section 22(1)(a) of the Federal Police Act were pending at various levels of administrative courts.\n" +
                            "\n" +
                            "Arms trade\n" +
                            "\n" +
                            "In March, the Federal Security Council released new principles in line with international standards for the sale of small arms and light weapons. In July, the Federal Cabinet passed a policy paper for the introduction of post-shipment controls.\n" +
                            "\n" +
                            "International justice\n" +
                            "\n" +
                            "On 21 May, the Federal Court of Justice partially overturned the decision of the Frankfurt Higher Regional Court in the case of Rwandan citizen Onesphore Rwabukombe, who was sentenced in 2014 to 14 years’ imprisonment for aiding the commission of a massacre at the Kiziguro church compound. It was found on appeal that Rwabukombe was actively involved in the murder of 450 people at the Kiziguro church, and that his previous sentence was too lenient. The case was referred back to a lower court in Frankfurt for retrial.\n" +
                            "\n" +
                            "On 28 September, the Higher Regional Court in Stuttgart sentenced Rwandan leaders of the Democratic Forces for the Liberation of Rwanda (FDLR) Ignace Murwanashyaka and Straton Musoni to 13 and eight years in prison respectively. They were both found guilty of leadership of a foreign terrorist group, while Ignace Murwanashyaka was additionally convicted of aiding in war crimes. It was the first trial based on the 2002 Code of Crimes against International Law.\n" +
                            "\n" +
                            "On 5 December 2014, the Higher Regional Court in Düsseldorf convicted three German citizens, originally from Rwanda, for their support to the FDLR.");
                    ImageLabel.setIcon(new ImageIcon("images/gm-map.gif"));
                    CountryFlag.setIcon(new ImageIcon("images/gm-lgflag.gif"));
                    ProjectLogo.setIcon(new ImageIcon("images/Human_Rights_2014_Icon_small.png"));
                } else {
                    textArea2AboutCountry.setText("General facts about the Country: Founded in the 12th \n" +
                            "century, the Principality of Muscovy was able to emerge from over 200 years of\n" +
                            " Mongol domination (13th-15th centuries) and to gradually conquer and absorb \n" +
                            "surrounding principalities. In the early 17th century, a new ROMANOV Dynasty \n" +
                            "continued this policy of expansion across Siberia to the Pacific. Under PETER I\n" +
                            " (ruled 1682-1725), hegemony was extended to the Baltic Sea and the country was \n" +
                            "renamed the Russian Empire. During the 19th century, more territorial acquisitions\n " +
                            "were made in Europe and Asia. Defeat in the Russo-Japanese War of 1904-05 contributed\n" +
                            " to the Revolution of 1905, which resulted in the formation of a parliament and other \n" +
                            "reforms. Repeated devastating defeats of the Russian army in World War I led to \n" +
                            "widespread rioting in the major cities of the Russian Empire and to the overthrow \n" +
                            "in 1917 of the imperial household. The communists under Vladimir LENIN seized power\n" +
                            " soon after and formed the USSR. The brutal rule of Iosif STALIN (1928-53) strengthened\n" +
                            " communist rule and Russian dominance of the Soviet Union at a cost of tens of \n" +
                            "millions of lives. After defeating Germany in World War II as part of an alliance \n" +
                            "with the US (1939-1945), the USSR expanded its territory and influence in Eastern \n" +
                            "Europe and emerged as a global power. The USSR was the principal adversary of the \n" +
                            "US during the Cold War (1947-1991). The Soviet economy and society stagnated in\n" +
                            " the decades following Stalin’s rule, until General Secretary Mikhail GORBACHEV \n" +
                            "(1985-91) introduced glasnost (openness) and perestroika (restructuring) in an \n" +
                            "attempt to modernize communism, but his initiatives inadvertently released forces \n" +
                            "that by December 1991 splintered the USSR into Russia and 14 other independent republics.\n" +
                            "Following economic and political turmoil during President Boris YELTSIN's term \n" +
                            "(1991-99), Russia shifted toward a centralized authoritarian state under the \n" +
                            "leadership of President Vladimir PUTIN (2000-2008, 2012-) in which the regime\n" +
                            " seeks to legitimize its rule through managed elections, populist appeals, a\n" +
                            " foreign policy focused on enhancing the country's geopolitical influence, and \n" +
                            "commodity-based economic growth. Russia faces a largely subdued rebel movement in\n" +
                            " Chechnya and some other surrounding regions, although violence still occurs \n" +
                            "throughout the North Caucasus.\n" +
                            "Ethnic groups:\n" +
                            "Russian 77.7%, Tatar 3.7%, Ukrainian 1.4%, Bashkir 1.1%, Chuvash 1%, Chechen 1%, \n" +
                            "other 10.2%, unspecified 3.9%\n" +
                            "note: nearly 200 national and/or ethnic groups are represented in Russia's 2010 \n" +
                            "census (2010 est.)\n" +
                            "Languages:\n" +
                            "Russian (official) 85.7%, Tatar 3.2%, Chechen 1%, other 10.1%\n" +
                            "note: data represent native language spoken (2010 est.)\n" +
                            "Religions:\n" +
                            "Russian Orthodox 15-20%, Muslim 10-15%, other Christian 2% (2006 est.)\n" +
                            "note: estimates are of practicing worshipers; Russia has large populations of \n" +
                            "non-practicing believers and non-believers, a legacy of over seven decades of \n" +
                            "Soviet rule; Russia officially recognizes Orthodox Christianity, Islam, Judaism,\n" +
                            " and Buddhism as traditional religions\n" +
                            "Population:\n" +
                            "142,423,773 (July 2015 est.)\n" +
                            "\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 13.8%\n" +
                            "male: 13.3%\n" +
                            "female: 14.5% (2013 est.)\n " +
                            "Death rate:\n" +
                            "13.69 deaths/1,000 population (2015 est.)\n" +
                            "\n" +
                            "Mother's mean age at first birth:\n" +
                            "24.6 (2009 est.)\n" +
                            "Education expenditures:\n" +
                            "4.1% of GDP (2008)\n" +
                            "\n" +
                            "Government type: federation\n" +
                            "Capital: Moscow\n" +
                            "Independence:\n" +
                            "24 August 1991 (from the Soviet Union); notable earlier dates: 1157 (Principality \n" +
                            "of Vladimir-Suzdal created); 16 January 1547 (Tsardom of Muscovy established); 22 October \n" +
                            "1721 (Russian Empire proclaimed); 30 December 1922 (Soviet Union established)\n" +
                            "National holiday:\n" +
                            "Russia Day, 12 June (1990)\n" +
                            "\n" +
                            "International law organization participation:\n" +
                            "has not submitted an ICJ jurisdiction declaration; non-party state to the ICCt\n ");
                            textArea1HumanRights.setText("State of Human Rights:\n" +
                                            "Freedom of expression\n" +
                                            "\n" +
                                            "Media freedom remained severely restricted, through direct state control and self-censorship. The editorial policy of most media outlets faithfully reproduced official views on key domestic and international events.\n" +
                                            "\n" +
                                            "The authorities extended their control over the internet. Thousands of websites and pages were blocked by internet providers on orders from the media regulator Roskomnadzor. Those targeted in violation of the right to freedom of expression included political satire, information shared by lesbian, gay, bisexual, transgender and intersex (LGBTI) activists, information on public protests and religious texts. A growing, but still small, number of individuals faced criminal prosecution for online postings, usually on charges under anti-extremism legislation; most of them received fines.\n" +
                                            "\n" +
                                            "Yekaterina Vologzheninova, a shop assistant from Yekaterinburg, was put on trial on 27 October for her satirical posts on social media in 2014 which criticized Russia’s annexation of Crimea and its military involvement in eastern Ukraine. The prosecution alleged that she had incited violence and “promoted hatred and enmity towards the Russian government officials, Russian volunteers fighting in eastern Ukraine and the specific ethnic group, the Russians”. Her trial was ongoing at the end of the year.2\n" +
                                            "\n" +
                                            "Harassment of independent media outlets and journalists continued. Past incidents of violence against independent journalists were rarely effectively investigated. Two men were arrested in connection with the beating of journalist Oleg Kashin in November 2010, and a third put on a wanted list. One suspect claimed he had proof that the beating had been ordered by the Governor of Pskov region, which tallied with Kashin’s suspicions, but the authorities declined to investigate the allegation further.\n" +
                                            "\n" +
                                            "Elena Milashina, a journalist from the independent newspaper Novaya Gazeta, reported that a 17-year-old Chechen girl was being forcibly married to a senior police officer three times her age and reportedly already married. The story was widely reported and caused a public outcry. Chechen leader Ramzan Kadyrov publicly supported the senior police officer and accused Milashina of lying and interfering in the private lives of the Chechen people. On 19 May, the Chechen government-owned online news agency Grozny-Inform published an article containing thinly veiled death threats against Milashina.\n" +
                                            "\n" +
                                            "The clampdown on freedom of expression extended beyond journalists and bloggers. Natalya Sharina, director of the state-run Library of Ukrainian Literature in the capital Moscow, was detained on 28 October under extremism-related charges. The investigators claimed that works by Ukrainian nationalist Dmitry Korchinsky had been found at the library, in a pile of literature that had not yet been catalogued. She was detained at a police station without bedding, food or drink until 30 October when she was placed under house arrest, pending possible charges.3\n" +
                                            "\n" +
                                            "On 15 September, Rafis Kashapov, an activist from Naberezhnye Chelny, Republic of Tatarstan, was convicted of inciting inter-ethnic hatred and threatening the territorial integrity of the Russian Federation; he was sentenced to three years’ imprisonment. He had been under arrest since 28 December 2014 in connection with posts on social media that criticized Russia’s role in the conflict in eastern Ukraine and the treatment of Crimean Tatars in Russian-occupied Crimea.\n" +
                                            "\n" +
                                            "On 10 November, the Kirsanovski District Court ruled that the environmentalist Yevgeny Vitishko should be released. He had served over half of his sentence following his conviction on trumped-up charges in the run-up to the 2014 Sochi Winter Olympic Games. However, on 20 November, a day before the court’s decision came into force, the Prosecutor’s Office appealed against the decision; Vitishko was finally released on 22 December after an appeal hearing.\n" +
                                            "\n" +
                                            "Freedom of assembly\n" +
                                            "\n" +
                                            "The right to freedom of peaceful assembly remained severely curtailed. Protests were infrequent, their number having declined following restrictions introduced in earlier years. Organizers were regularly refused permission to hold street rallies or only allowed to hold them in non-central locations. Those who defied the ban or the rules were penalized through fines and detention.\n" +
                                            "\n" +
                                            "Monstration, a humorous annual street event in Novosibirsk mocking the pomposity of the May Day march, was disallowed for the first time since 2005. Its organizer, Artem Loskutov, was arrested and sentenced to 10 days’ detention for violating the law on assemblies after he and several other “monstrators” joined the official May Day march instead.\n" +
                                            "\n" +
                                            "For the first time, a peaceful street protester was convicted under the 2014 law which criminalized repeated participation in unauthorized assemblies.\n" +
                                            "\n" +
                                            "On 7 December, a Moscow court sentenced Ildar Dadin to three years in a prison colony for his repeated participation in “unauthorized” assemblies between August and December 2014. He had been placed under house arrest on 30 January, after serving a 15-day detention for joining a peaceful protest in Moscow against the politically motivated conviction of Oleg Navalny, the brother of anti-graft campaigner and opposition leader Alex Navalny.\n" +
                                            "\n" +
                                            "Two other peaceful protesters from Moscow, Mark Galperin and Irina Kalmykova, also faced criminal prosecution under the same law at the end of the year.\n" +
                                            "\n" +
                                            "Prisoners of conscience Stepan Zimin, Aleksei Polikhovich and Denis Lutskevich, who had been detained in 2012 in connection with the Bolotnaya Square protests, were released during the year, having completed their prison sentences. Another prisoner of conscience, Sergey Krivov, remained in prison; the authorities brought criminal proceedings against at least two further individuals in connection with the Bolotnaya protests.\n" +
                                            "\n" +
                                            "Freedom of association\n" +
                                            "\n" +
                                            "Freedom of association was further restricted. By the end of the year, the Ministry of Justice’s register of NGOs considered “foreign agents” contained 111 entries, requiring the NGOs concerned to put this stigmatizing label on all their publications and observe onerous reporting requirements. NGOs that defied these requirements faced hefty fines. Not a single NGO succeeded in challenging their inclusion on the register in court. Seven were struck off the register after giving up all foreign funding, and a further 14 NGOs included on the register chose to close down.\n" +
                                            "\n" +
                                            "The Human Rights Centre (HRC) Memorial was fined Rub 600,000 (US$8,800) in September after its sister organization, the Historical and Educational Centre Memorial – which was not on the register – did not mark its publications with the label “foreign agent”. The HRC Memorial lost its court appeal against the decision. Following a regular inspection of the HRC Memorial in November, the Ministry of Justice concluded that criticism by its members of the Bolotnaya Square trials and of Russian policies in Ukraine “undermined the foundations of the constitutional system” and amounted to “calls for the overthrow of the current government and change of the political regime”. The Ministry submitted its “findings” to the Prosecutor’s Office for further investigation.\n" +
                                            "\n" +
                                            "In May, a law was passed authorizing the Prosecutor’s Office to designate any foreign organization as “undesirable” on the grounds of posing a “threat to the country’s constitutional order, defence or state security”, with the immediate effect of rendering its presence, and any activity on its behalf, unlawful. In July, the US-based National Endowment for Democracy was declared “undesirable”. Three more donor organizations, the Open Society Foundation, the Open Society Institute Assistance Foundation and the US Russia Foundation for Economic Advancement and the Rule of Law, were declared “undesirable” in November and December.\n" +
                                            "\n" +
                                            "Rights of lesbian, gay, bisexual, transgender and intersex people\n" +
                                            "\n" +
                                            "LGBTI activists continued to operate in an extremely hostile environment. Discrimination against LGBTI individuals continued to be widely reported.\n" +
                                            "\n" +
                                            "On 25 March, a court in St Petersburg ruled that the Children-404 group – an online community set up by journalist Elena Klimova to support LGBTI teenagers – be blocked. In July, a court in Nizhny Tagil, Sverdlovsk region, fined Klimova Rub 50,000 (US$830) for “propaganda of non-traditional sexual relations among minors”. On 2 October, a court in St Petersburg ruled that the page should be unblocked.\n" +
                                            "\n" +
                                            "The authorities continued to violate LGBTI individuals’ right to peaceful assembly. In May, LGBTI activist Nikolay Alekseev attempted to hold an unauthorized Pride march in Moscow. It resulted in clashes with anti-LGBTI protesters and 10 days’ detention for three LGBTI activists, including Nikolay Alekseev. In St Petersburg, LGBTI activists were able to conduct some public activities without interference from police.\n" +
                                            "\n" +
                                            "Justice system\n" +
                                            "\n" +
                                            "Several high-profile trials exposed deep-rooted and widespread flaws in Russia’s criminal justice system, including the lack of equality of arms, the use of torture and other ill-treatment in the course of investigations as well as the failure to exclude torture-tainted evidence in court, the use of secret witnesses and other secret evidence which the defence could not challenge, and the denial of the right to be represented by a lawyer of one’s choice. Less than 0.5% of trials resulted in acquittals.\n" +
                                            "\n" +
                                            "Svetlana Davydova was one of the growing number of cases of alleged high treason and espionage, under vague offences introduced in 2012. She was arrested on 21 January for a phone call she had made to the Ukrainian Embassy eight months earlier, to share her suspicions that soldiers from her town Vyazma, Smolensk region, were being sent to fight in eastern Ukraine. Her state-appointed lawyer told the media that she had “confessed to everything” and declined to appeal against her detention because “all these hearings and the fuss in the media [create] unnecessary psychological trauma for her children”. On 1 February, two new lawyers took up her case. She complained that her initial lawyer had convinced her to plead guilty to reduce her likely sentence from 20 to 12 years. On 3 February, she was released; on 13 March, in marked contrast to all other treason cases, criminal proceedings against her were terminated.\n" +
                                            "\n" +
                                            "In September, the trial of Nadezhda Savchenko, a Ukrainian citizen and member of the Aidar volunteer battalion, began. She was accused of deliberately directing artillery fire to kill two Russian journalists during the conflict in Ukraine in June 2014. She insisted that the case against her was fabricated and the testimonies against her, including by several secret witnesses, were false. Her trial was marred by myriad procedural flaws.\n" +
                                            "\n" +
                                            "On 15 December, President Putin signed a new law under which the Constitutional Court can pronounce the European Court of Human Rights’ and other international courts’ decisions “unimplementable” if they “violate” the Russian Constitution’s “supremacy”.\n" +
                                            "\n" +
                                            "Refugees’ and migrants’ rights\n" +
                                            "\n" +
                                            "According to official figures, in the first nine months of the year, 130,297 people were given temporary asylum, 129,506 of them from Ukraine and 482 from Syria. Only 96 of the 1,079 applications for permanent refugee status were granted, none of them to Syrian nationals. NGOs reported numerous obstacles, including corruption and deliberate misinformation, intended to discourage those seeking international protection from applying for permanent or temporary asylum.\n" +
                                            "\n" +
                                            "A family of six refugees from Syria, including four children, were stranded in the international transit zone of Moscow’s Sheremetyevo airport for over two months. On 10 September, border officials denied them entry claiming their travel documents were fake. On 19 November, Khimki City Court fined them Rub 10,000 (US$150) for trying to enter the country under forged documents; the following day, they were registered as asylum-seekers and relocated to Tver region, with help from the NGO Civic Assistance Committee.\n" +
                                            "\n" +
                                            "There were regular reports of forcible return of individuals to Uzbekistan and other Central Asian countries, where they risked being subjected to torture and other serious human rights violations.\n" +
                                            "\n" +
                                            "North Caucasus\n" +
                                            "\n" +
                                            "Fewer attacks by armed groups were reported in the North Caucasus than in previous years.\n" +
                                            "\n" +
                                            "Law enforcement agencies continued to rely on security operations as their preferred method of combating armed groups, and continued to be suspected of resorting to enforced disappearances, unlawful detention, as well as torture and other ill-treatment of detainees.\n" +
                                            "\n" +
                                            "Human rights reporting from the region visibly declined, due to a severe clampdown on human rights defenders and independent journalists, who regularly faced harassment, threats and violence, including from law enforcement officials and pro-government groups.\n" +
                                            "On 3 June, an aggressive mob surrounded the office building of the human rights group Joint Mobile Group in Chechnya’s capital Grozny. Masked men forced their way into the office, destroying its contents and forcing staff to evacuate.4 No suspects had been identified by the end of the year. On 6 November, the office and residence in the Republic of Ingushetia of human rights defender Magomed Mutsolgov were searched by armed law enforcement officers, who seized documents and IT equipment. According to Mutsolgov, the warrant authorizing the search stated that he was “acting in the interests of the USA, Georgia, Ukraine and the Syrian opposition“");
                    ImageLabel.setIcon(new ImageIcon("images/rs-map.gif"));
                    CountryFlag.setIcon(new ImageIcon("images/rs-lgflag.gif"));
                    ProjectLogo.setIcon(new ImageIcon("images/Human_Rights_2014_Icon_small.png"));
                }

            }
        });

        scrollBarVertical.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        scrollBar1Horizontal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        HumanRightsForm dialog = new HumanRightsForm();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);}


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }}



