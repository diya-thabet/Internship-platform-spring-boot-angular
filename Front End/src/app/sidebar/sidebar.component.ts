import { Component } from '@angular/core';
import { Router } from '@angular/router';

export interface Company {
  name: string;
  projects: number;
  description: string;
  image: string;
  buttonText: string;
  buttonLink: string;
}

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent {
  constructor(private router: Router) {}

  companies = [
    {
      name: 'EY (Ernst & Young)',
      projects: 74,
      description: `EY est une multinationale renommée spécialisée dans l’audit, le conseil, la fiscalité et les services juridiques. Son environnement dynamique favorise l’innovation, la transformation digitale et les solutions durables, tout en accompagnant les plus grands groupes mondiaux dans leur stratégie de croissance.`,
      image: 'https://logowik.com/content/uploads/images/ey8162.logowik.com.webp',
      buttonText: 'Explorer EY',
      buttonLink: 'https://drive.google.com/your-link-here'
    },
    {
      name: 'Vermeg',
      projects: 63,
      description: `Vermeg conçoit des solutions logicielles pour les institutions financières et les assureurs. Elle allie expertise métier et puissance technologique pour accompagner la transformation numérique des services bancaires, avec un focus sur la conformité, l'automatisation et la fluidité des opérations.`,
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhKwI2oBuDcvt2YDYXPGWuKqwXGiwKeU7c2Q&s',
      buttonText: 'Découvrir Vermeg',
      buttonLink: 'https://drive.google.com/your-link-here'
    },
    {
      name: 'Sofrecom',
      projects: 81,
      description: `Filiale du groupe Orange, Sofrecom est spécialisée dans le conseil et l’ingénierie télécoms. Elle intervient dans des projets stratégiques liés à la connectivité, à la data, au cloud et à l'expérience client, en adoptant une démarche d'innovation responsable et inclusive.`,
      image: 'https://www.sofrecom.com/media/layout/img/sofrecom-meta-logo-small.png',
      buttonText: 'Voir Sofrecom',
      buttonLink: 'https://drive.google.com/your-link-here'
    },
    {
      name: 'Focus Corporation',
      projects: 59,
      description: `Focus est un acteur de pointe dans le développement logiciel, l’IoT, l’IA et la cybersécurité. Reconnue pour ses projets innovants à forte valeur ajoutée, la société accompagne ses clients dans leur transformation technologique avec des solutions personnalisées et sécurisées.`,
      image: 'https://focus-corporation.com/wp-content/uploads/2022/03/277173466_1802330499978071_1374118157907403705_n.jpg',
      buttonText: 'En savoir plus',
      buttonLink: 'https://drive.google.com/your-link-here'
    },
    {
      name: 'Instadeep',
      projects: 88,
      description: `Instadeep est une entreprise pionnière en intelligence artificielle et en machine learning. Elle développe des algorithmes avancés pour résoudre des problèmes complexes en bioinformatique, logistique, finance et santé, en collaboration avec Google DeepMind, Nvidia et BioNTech.`,
      image: 'https://ikigai.tn/wp-content/uploads/2023/04/InstaDeep-2.jpg',
      buttonText: 'Explorer Instadeep',
      buttonLink: 'https://drive.google.com/your-link-here'
    },
    {
      name: 'MASS Analytics',
      projects: 47,
      description: `Spécialisée dans le Marketing Mix Modeling (MMM), MASS Analytics fournit des solutions de data science pour optimiser les investissements marketing. Sa plateforme puissante permet d’analyser, de simuler et de prédire l’impact des campagnes pour maximiser le ROI.`,
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqfquReAAWOoWBdlfMrPVDhl2_Dw0v5zMggQ&s',
      buttonText: 'Voir MASS',
      buttonLink: 'https://drive.google.com/your-link-here'
    }
  ];

  selectedMenu: string = 'watermark';
  selectedcliq: string = 'ac1';
  selectedMenuRo = 'Roadmap';
  showRoadmapDetail = false;
  imageSrc = 'assets/img/ser.jpeg';

  onMenuClick(menu: string): void {
    this.selectedMenu = menu;
  }

  ThisClique(menu: string): void {
    this.selectedcliq = menu;
  }

  openYoutube(url: string) {
    window.open(url);
  }
  openYoutube2(url: string) {
    window.open(url);
  }
  
  GotoRoadmapDetail(): void {
    this.showRoadmapDetail = true;
  }

  domains = [
    {
      title: 'Frontend',
      description: 'HTML, CSS, JavaScript, Angular, React...',
      img: 'assets/img/Frontend.png'
    },
    {
      title: 'Backend',
      description: 'Node.js, Spring Boot, APIs, Databases...',
      img: 'assets/img/backend.png'
    },
    {
      title: 'Data Structures',
      description: 'Algorithms, Trees, Graphs, Sorting...',
      img: 'assets/img/Datastructurejpg.jpg'
    },
    {
      title: 'AI / Machine Learning',
      description: 'Python, TensorFlow, NLP, Deep Learning...',
      img: 'assets/img/ai-icon.png'
    }
  ];
  courses2 = [
    {
      img: 'assets/img/6035102_7d1a.webp',
      tag: 'Full Stack',
      category: 'frontend',
      title: 'Full Stack Web Development: From Frontend Interfaces to Backend APIs',
      progress: 65,
      avatars: [
        'assets/img/c76b3f38a6b60c338d6534b4eacc9af2.jpg',
        'assets/img/0733ba760b29378474dea0fdbcb97107.jpg',
        'assets/img/Professional-Headshot-Poses-Blog-Post.webp'
      ],
      more: '+60',
      link: 'https://www.youtube.com/watch?v=nu_pCVPKzTk' 
    },
    {
      img: 'assets/img/2196488_8fc7_10.webp',
      tag: 'Cloud Computing',
      category: 'frontend',
      title: 'Mastering AWS Cloud Architecture for Enterprise Solutions',
      progress: 65,
      avatars: [
        'assets/img/f3784adc704a1bc9bcb2e494cd39caee.jpg',
        'assets/img/images (1).jpeg',
        'assets/img/Three-Statistics-That-Will-Make-You-Rethink-Your-Professional-Profile-Picture_thumbnail.jpg'
      ],
      more: '+132',
      link: 'https://www.youtube.com/watch?v=Ia-UEYYR44s' // exemple
    },
    {
      img: 'assets/img/images.jpeg',
      tag: 'Cloud Computing',
      category: 'backend',
      title: 'Implementing Cloud Solutions with Microsoft Azure Practical Approach',
      progress: 40,
      avatars: [
        'assets/img/images (2).jpeg',
        'assets/img/Linkedin-headshot.jpg',
        'assets/img/images (3).jpeg'
      ],
      more: '+278',
      link: 'https://www.youtube.com/watch?v=54bEwC6cwJY' // exemple
    },
    {
      img: 'assets/img/maxresdefault (2).jpg',
      tag: 'DevOps',
      category: 'frontend',
      title: 'Cloud DevOps and Automation: CI/CD Pipelines',
      progress: 65,
      avatars: [
        'assets/img/images (4).jpeg',
        'assets/img/images (5).jpeg',
        'assets/img/b4d11474d6617e3b98aaf07ca09e1c25.jpg'
      ],
      more: '+154',
      link: 'https://www.youtube.com/watch?v=1XOjUefKqCo' // exemple
    },
    {
      img: 'assets/img/hq720.jpg',
      tag: 'Data Structures & Algorithms',
      category: 'frontend',
      title: 'Learn Data Structures & Algorithms for Development',
      progress: 65,
      avatars: [
        'assets/img/images (4).jpeg',
        'assets/img/images (5).jpeg',
        'assets/img/b4d11474d6617e3b98aaf07ca09e1c25.jpg'
      ],
      more: '+123',
      link: 'https://www.youtube.com/watch?v=8hly31xKli0' // exemple
    },
    {
      img: 'assets/img/6222091_7c3f_3 (1).webp',
      tag: 'Cybersecurity',
      category: 'backend',
      title: 'Cybersecurity Foundations Modern IT Infrastructures',
      progress: 40,
      avatars: [
        'assets/img/images (4).jpeg',
        'assets/img/images (5).jpeg',
        'assets/img/b4d11474d6617e3b98aaf07ca09e1c25.jpg'
      ],
      more: '+92',
      link: 'https://www.youtube.com/watch?v=inWWhr5tnEA' // exemple
    }
  ];
  


  courses = [
    {
      title: "Beginner's Guide To Becoming A Professional Frontend Developer",
      tag: 'Frontend',
      progress: 80,
      image: 'assets/img/maxresdefault.jpg',
      avatars: [
        'assets/img/FRA-1699dark-sq.jpg',
        'assets/img/PH-76-Edit.jpg',
        'assets/img/ellie-jean-1.jpg'
      ],
      more: '+124',
      link: 'https://www.youtube.com/watch?v=G3e-cpL7ofc' // Frontend tutorial
    },
    {
      title: "Beginner's Guide To Becoming A Professional Backend Developer",
      tag: 'Backend',
      progress: 40,
      image: 'assets/img/maxresdefault (1).jpg',
      avatars: [
        'assets/img/b13ca305487326d44135fe713b30e865.jpg',
        'assets/img/dafdf25168edcb2f0e1d8702797946cc.jpg',
        'assets/img/FINAL-Blog-Images.webp'
      ],
      more: '+27',
      link: 'https://www.youtube.com/watch?v=ldYcgPKEZC8' // Backend tutorial
    }
  ];

  selectedCategory: string = 'All'; 
  filterByCategory(category: string) {
    this.selectedCategory = category;
  }  
  resources = [
    {
      img: 'assets/img/istockphoto-537331500-612x612.jpg',
      title: 'Les bases des algorithmes',
      category: 'Programming',
      description: 'Comprendre les structures de données et les algorithmes fondamentaux pour résoudre des problèmes complexes.',
      link: 'https://openclassrooms.com/fr/courses/7527306-decouvrez-le-fonctionnement-des-algorithmes'
    },
    {
      img: 'assets/img/pexels-photo-6424591.webp',
      title: 'Introduction aux Réseaux Neuronaux',
      category: 'AI',
      description: 'Une exploration des réseaux neuronaux artificiels et de leur rôle dans le machine learning.',
      link: 'https://www.coursera.org/learn/neural-networks-deep-learning'
    },
    {
      img: 'assets/img/photo-1515879218367-8466d910aaa4.jfif',
      title: 'Sécurité des API',
      category: 'Cybersecurity',
      description: 'Apprenez à protéger vos APIs contre les attaques les plus fréquentes.',
      link: 'https://developer.mozilla.org/fr/docs/Web/API'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxs8W4ecbyQLZBKO-sPDBJNdGiqcSTMs9fyQ&s',
      title: 'AI For Everyone - Andrew Ng',
      category: 'AI',
      description: 'Un cours pour comprendre l’impact de l’intelligence artificielle sur les entreprises.',
      link: 'https://www.coursera.org/learn/ai-for-everyone'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvMcG5ZZNu_LjKoKcSb9RFehKFuXKrhYyQFw&s',
      title: 'Data Analyst with Python',
      category: 'Data',
      description: 'Formation complète pour devenir Data Analyst avec Python.',
      link: 'https://www.datacamp.com/tracks/data-analyst-with-python'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCCQqsg8Z8ijJnHidpCCUP3uvbZ594NVOMGg&s',
      title: 'Learn SQL',
      category: 'Data',
      description: 'Apprenez les bases du langage SQL pour manipuler les bases de données.',
      link: 'https://www.codecademy.com/learn/learn-sql'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD0CCfMjIaVx4HvygKbobkj77OUB-aKPRI4Q&s',
      title: 'Computer Networking ',
      category: 'Networking',
      description: 'Introduction aux concepts de base des réseaux informatiques.',
      link: 'https://www.coursera.org/learn/computer-networking'
    },
    {
      img: 'https://media.licdn.com/dms/image/v2/C4E1BAQEeqFEe7kMZXg/company-background_10000/company-background_10000/0/1584026339081/cisco_ccna_training_tips_cover?e=2147483647&v=beta&t=R1lqqngF8qhL8NAbAkUhtSxKr-G0Zi4nsXQ8uE6Csf8',
      title: 'Cisco CCNA ',
      category: 'Networking',
      description: 'Préparation à la certification CCNA avec Cisco Networking Academy.',
      link: 'https://www.netacad.com/courses/packet-tracer'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNCYebAOFTC9Hay8Br_TjprAXZEy0WDZP4Uw&s',
      title: 'Data Engineering on Google Cloud',
      category: 'Data',
      description: 'Concevez des pipelines de traitement de données sur GCP.',
      link: 'https://www.coursera.org/specializations/gcp-data-machine-learning'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNaoKie0udiqMvVnAe2_KoGtWKz4FMYevWQA&s',
      title: 'Natural Language Processing',
      category: 'AI',
      description: 'Comprendre le traitement du langage naturel avec Python.',
      link: 'https://www.coursera.org/specializations/natural-language-processing'
    },
    {
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtbEkXPWjvv8VU7JjZPsgHBTcASfCPSxNY4g&s',
      title: 'Advanced Networking',
      category: 'Networking',
      description: 'Approfondissez les concepts avancés des réseaux modernes.',
      link: 'https://www.udemy.com/course/advanced-networking/'
    },
    {
      img: 'https://media.licdn.com/dms/image/v2/D4D22AQGGUHJ6fvtfBQ/feedshare-shrink_800/feedshare-shrink_800/0/1713098591405?e=2147483647&v=beta&t=JMbL8PApBb4S1PoTWrLZ2kALbSQZIM_kguLMthlJd1c',
      title: 'Data Visualization with Tableau',
      category: 'Data',
      description: 'Créez des dashboards interactifs avec Tableau.',
      link: 'https://www.coursera.org/specializations/data-visualization'
    },
    {
      img: 'https://pbs.twimg.com/media/ErTCyXlXEAA4lnM.jpg',
      title: 'Machine Learning - Stanford',
      category: 'AI',
      description: 'Cours incontournable d’Andrew Ng sur le Machine Learning.',
      link: 'https://www.coursera.org/learn/machine-learning'
    }
  ];
  currentResourcePage: number = 1;
itemsPerPage: number = 3;

get paginatedResources() {
  const filtered = this.selectedResourceCategory === 'All'
    ? this.resources
    : this.resources.filter(r => r.category === this.selectedResourceCategory);
  const start = (this.currentResourcePage - 1) * this.itemsPerPage;
  return filtered.slice(start, start + this.itemsPerPage);
}

get totalResourcePages() {
  const filtered = this.selectedResourceCategory === 'All'
    ? this.resources
    : this.resources.filter(r => r.category === this.selectedResourceCategory);
  return Math.ceil(filtered.length / this.itemsPerPage);
}

selectedResourceCategory: string = 'All';

changeResourceCategory(category: string) {
  this.selectedResourceCategory = category;
  this.currentResourcePage = 1; // reset to first page
}

goToNextResourcePage() {
  if (this.currentResourcePage < this.totalResourcePages) this.currentResourcePage++;
}

goToPreviousResourcePage() {
  if (this.currentResourcePage > 1) this.currentResourcePage--;
}

  openInNewTab(url: string): void {
    window.open(url,);
  }articles = [
    {
      category: 'Article',
      title: 'What is Cloud Computing? An Introduction to Cloud Services',
      link: 'https://www.ibm.com/cloud/learn/cloud-computing',
      progressText: '4/6 Chapters',
      chapter: 'Chapter 1',
      currentLesson: '',
      buttonText: 'Continue'
    },
    {
      category: 'Article',
      title: 'How to Implement REST APIs in Python',
      link: 'https://realpython.com/api-integration-in-python/',
      progressText: '5/9 Articles',
      chapter: 'Chapter 2',
      currentLesson: '',
      buttonText: 'Continue'
    },
    {
      category: 'Article',
      title: 'Exploring Machine Learning Algorithms',
      link: 'https://towardsdatascience.com/a-guide-to-understanding-machine-learning-algorithms-7da1c7f8182d',
      progressText: '3/8 Lessons',
      chapter: 'Chapter 6',
      currentLesson: '',
      buttonText: 'Continue'
    },
    {
      category: 'Article',
      title: 'DevOps Explained: Practices, Tools, and Benefits',
      link: 'https://azure.microsoft.com/en-us/resources/cloud-computing-dictionary/what-is-devops/',
      progressText: '2/5 Topics',
      chapter: 'Chapter 3',
      currentLesson: '',
      buttonText: 'Continue'
    },
    {
      category: 'Article',
      title: 'Cybersecurity Basics: Protecting Yourself Online',
      link: 'https://www.cisa.gov/news-events/news/cybersecurity-awareness-basics',
      progressText: '1/4 Topics',
      chapter: 'Chapter 4',
      currentLesson: '',
      buttonText: 'Continue'
    },
    {
      category: 'Article',
      title: 'Modern Web Development: Frontend Frameworks Overview',
      link: 'https://www.freecodecamp.org/news/front-end-frameworks/',
      progressText: '6/10 Sections',
      chapter: 'Chapter 5',
      currentLesson: '',
      buttonText: 'Continue'
    }
  ];
  
  
  currentPage = 0;
  videosPerPage = 3;
  videos = [
    {
      date: '06 May 2025',
      icon: 'assets/img/icons8-video-64.png',
      title: 'Programming Solutions',
      description: `
        Learn more about our programming solutions with in-depth explanations, practical examples, and expert tips.
        This section provides additional resources, step-by-step tutorials, and answers to frequently asked questions
        to help you make the most of our code samples and integrate them effectively into your own projects.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=rfscVS0vtbw'
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Artificial Intelligence Essentials',
      description: `
        Explore the foundations of Artificial Intelligence through clear explanations, real-world scenarios,
        and hands-on projects. This section offers beginner to intermediate tutorials, conceptual clarity,
        and a breakdown of key technologies such as neural networks, NLP, and computer vision with practical examples.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=2ePf9rue1Ao'
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Big Data Technologies',
      description: `
        Dive deep into the world of Big Data with detailed guidance on processing massive datasets using Hadoop and Spark.
        This content explains distributed computing, stream processing, providing tutorials,
        use cases, and configuration tips for building scalable data architectures in real projects.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=2hSPVdUCzG4'
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Embedded Systems Design',
      description: `
        Learn how embedded systems shape the modern world through sensors, microcontrollers, and firmware development.
        This guide covers system architecture,
        efficient devices — from concept to deployment with integration strategies and optimization techniques.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=sF0pJ1oIexA'
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'DevOps Fundamentals',
      description: `
        Understand the principles of DevOps and how it bridges the gap between development and operations.
        Learn about CI/CD pipelines, automation tools like Jenkins, Docker, Kubernetes, and best practices for agile delivery.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=0yWAtQ6wYNM' // DevOps for Beginners
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Introduction to Data Engineering',
      description: `
        Discover the role of a Data Engineer and key tools such as Apache Kafka, Airflow, and ETL pipelines.
        Learn how to design and build scalable data systems for analytics and machine learning.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=9ajq2n6uo5Y' // Data Engineering explained
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Mastering Agile Methodologies',
      description: `
        Learn how Agile works in software development, including Scrum, Kanban, sprints, and user stories.
        Understand team roles, ceremonies, and how to deliver faster and more efficiently.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=Z9QbYZh1YXY' // Agile in 7 minutes
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Cybersecurity Basics',
      description: `
        Get an introduction to cybersecurity concepts including network security, encryption, authentication,
        and how to defend against threats like malware, phishing, and data breaches.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=inWWhr5tnEA' // Cybersecurity for Beginners
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Cloud Computing Explained',
      description: `
        Understand the core concepts of cloud computing: IaaS, PaaS, SaaS, scalability, and deployment models.
        Learn how AWS, Azure, and GCP operate in practice with use cases and pricing models.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=2LaAJq1lB1Q' // Cloud for Beginners
    },
    {
      icon: 'assets/img/icons8-video-64.png',
      title: 'Software Architecture Patterns',
      description: `
        Dive into software architecture patterns like microservices, monoliths, event-driven, and layered architecture.
        Learn when to use each and how to make scalable, maintainable systems.
      `,
      urlvideo: 'https://www.youtube.com/watch?v=Re3Sqwl2FsE' // Architecture Explained
    }
  ];
  

  openVideo(url: string): void {
    window.open(url);
  }
    paginatedVideos() {
    const start = this.currentPage * this.videosPerPage;
    return this.videos.slice(start, start + this.videosPerPage);
  }
  
  nextPage() {
    if ((this.currentPage + 1) * this.videosPerPage < this.videos.length) {
      this.currentPage++;
    }
  }
  
  prevPage() {
    if (this.currentPage > 0) {
      this.currentPage--;
    }
  }
  podcasts = [
    {
      imageSrc: 'assets/img/ser.jpeg',
      title: 'Lex Fridman Podcast',
      description: 'Lex hosts researchers, entrepreneurs, and thinkers (Elon Musk, Yann LeCun, etc.). The conversations are deep, often focusing on AI, consciousness, robotics, and disruptive technology.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/7kz2OGM8NyN7tDjNGV8ga2' // Spotify link
    },
    {
      imageSrc: 'https://i.scdn.co/image/ab67656300005f1fa06ed4e780ae907c337c0f2e',
      title: 'The AI Alignment Podcast',
      description: 'This podcast explores AI alignment issues, existing risks, and proposed solutions by researchers. An essential discussion for understanding the future challenges of artificial intelligence.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/2B2DTrzm6L8JWtp79cIEpP' // Spotify link
    },
    {
      imageSrc: 'https://i.scdn.co/image/ab6765630000ba8a1d209fee57b59dc14a16d1ec',
      title: 'Data Skeptic',
      description: 'Data Skeptic discusses topics around data, AI, and machine learning. This podcast offers discussions on technical and theoretical subjects in data science.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/2qln7TYJYvItuGRmkbOxnI' // Spotify link
    },
    {
      imageSrc: 'https://img.transistor.fm/eMFTvyo2LA715Kywms4fJrKWJx6e_YXqMZSYAhF_PTA/rs:fill:3000:3000:1/q:60/aHR0cHM6Ly9pbWct/dXBsb2FkLXByb2R1/Y3Rpb24udHJhbnNp/c3Rvci5mbS9iZGUz/NzE4NjE5OWI1NDhm/ZmQ3YTNiNjVhMzA0/NmVhYi5qcGc.jpg',
      title: 'Devops Podcast',
      description: 'A podcast that covers the latest trends and advancements in Devops. It features interviews with leaders in the field to discuss the evolution of AI and its impact on our society.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/4I7pMv0zrlb43UnkZfECYz' // Spotify link
    },
    {
      imageSrc: 'https://www.superdatascience.com/sponsorship.jpg',
      title: 'The Data Science Podcast',
      description: 'This podcast is a valuable resource for data science enthusiasts. It features interviews with data scientists and discussions about tools, methods, and use cases in the field.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/2OgTPpyC4PLJkqaFsAX31z' // Spotify link
    },
    {
      imageSrc: 'https://i.scdn.co/image/ab6765630000ba8a8e08d3b0f126c847db80f0a6',
      title: 'The Vergecast',
      description: 'A podcast about technology, gadgets, and innovation. The Vergecast provides in-depth analysis of tech news, innovation trends, and discussions on major tech events.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/1JhCZz7UNWi65V8YhpqKNB' // Spotify link
    },
    {
      imageSrc: 'https://d3t3ozftmdmh3i.cloudfront.net/production/podcast_uploaded_episode400/28958975/28958975-1678479518979-21b9429a7f14b.jpg',
      title: 'The Coding Blocks Podcast',
      description: 'A podcast focused on programming and software development. It covers a wide range of topics, from best practices in development to technical discussions on popular tools.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/3p3gdwJlCo38IuXtpR88RH' // Spotify link
    },
    {
      imageSrc: 'https://is1-ssl.mzstatic.com/image/thumb/Podcasts123/v4/b5/b1/43/b5b14333-7cbe-123d-c444-0204e5d08102/mza_311421542997449775.png/1200x1200bf-60.jpg',
      title: 'The Changelog',
      description: 'This podcast covers the latest open-source news, popular projects, and the technologies shaping the future of software development. It is a great resource for developers.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/6VVjRYLB9eEN9f9tMGpgl0' // Spotify link
    },
    {
      imageSrc: 'https://i.ytimg.com/vi/GexmZfEWST0/maxresdefault.jpg',
      title: 'Cloudcast',
      description: 'Cloudcast discusses cloud technologies, platforms like AWS, Azure, and Google Cloud, and explores best practices in cloud computing and infrastructure.',
      buttonText: 'Listen Now',
      buttonIcon: 'bi-telegram',
      spotifyLink: 'https://open.spotify.com/show/4xfA9nUzjo8mj6WkcOymXI' // Spotify link
    }
  ];
  openSpotify(spotifyLink: string) {
    window.location.href = spotifyLink;
  }
          
  
}
